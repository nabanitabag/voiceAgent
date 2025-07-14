package com.tableausoftware.core.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import com.tableausoftware.core.model.*;
import com.tableausoftware.core.service.UserServiceClient;
import com.tableausoftware.core.utils.SiteMap;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeleteUserExecutor implements IntentExecutor {
    UserServiceClient userServiceClient = new UserServiceClient();

    @Override
    public String execute(IntentClassificationResponse response) throws JsonProcessingException {
        UUID userId;

        if (response.getUserName() == null) {
            return "Specify username";
        }

        String userName = response.getUserName().replaceAll("\\s+", "").toLowerCase();

        List<UserDTO> users = userServiceClient.getUserByUserName(userName).as(GetUsersResponseDTO.class).getUsers();
        boolean hasAdsUser = users != null && users.stream()
                    .anyMatch(user -> user.getUserName().equalsIgnoreCase(userName));

            if (hasAdsUser) {
                userId = users.stream()
                        .filter(user -> user.getUserName().equalsIgnoreCase(userName))
                        .map(UserDTO::getUserId)
                        .findFirst().orElse(UUID.randomUUID());
                System.out.println("User found in list: " + userId);
            } else {
                System.out.println("User not found.");
                return "User with username " + response.getUserName()+ " not found in this tenant.";
            }

        Response apiResponse;
            if (response.getSite() != null) {
                UUID siteId = SiteMap.getSiteId(response.getSite());
                apiResponse = userServiceClient.fireUpdateUserAndReturnOnJobSuccess(userId, siteId);
            } else {
                apiResponse = userServiceClient.fireDeleteUser(userId);
            }

        if (apiResponse.getStatusCode() != 202) {
            System.out.println(apiResponse.prettyPrint());
            ApiErrorResponse errResponse = apiResponse.as(ApiErrorResponse.class);
            return "Unable to delete user because: " + errResponse.getMessage();
        }

        UserAckResponse userAckResponse = apiResponse.as(UserAckResponse.class);
        System.out.println("Deleting user: " + userId + " from tenant: " + userAckResponse.getTenantId());

        BulkUserOpDetails jobDetails = userServiceClient.pollJobAndReturnOnCompletion(150, 600,
                userAckResponse.getJobId());

        if (jobDetails.getStatus() == BulkUserOpDetails.StatusEnum.FAILED) {
            return "User deletion failed because: " + jobDetails;
        } else if (jobDetails.getStatus() == BulkUserOpDetails.StatusEnum.SUCCESSFUL){
            if (response.getSite() != null) {
                return "User successfully deleted from site " + response.getSite();
            } else {
                return "User successfully removed from Tableau tenant.";
            }
        }

        return "User deletion took too much time. Try again.";
    }
}
