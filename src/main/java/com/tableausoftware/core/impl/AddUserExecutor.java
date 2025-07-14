package com.tableausoftware.core.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tableausoftware.core.dto.response.ImportExternalUsersResponse;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import com.tableausoftware.core.model.*;
import com.tableausoftware.core.service.UserServiceClient;
import com.tableausoftware.core.utils.SiteMap;
import io.restassured.response.Response;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
    public class AddUserExecutor implements IntentExecutor {
        private UserServiceClient userServiceClient = new UserServiceClient();

        private String defaultUserName = "tableauVoiceAdmin" + UUID.randomUUID() + "@example.com";
        private final UUID tenantId = UUID.fromString("f83bf730-8e51-4f56-928d-d6fd0c409485");
        private UUID siteId;

        @Override
        public String execute(IntentClassificationResponse response) throws JsonProcessingException {
            String receivedUserName  = Optional.ofNullable(response.getUserName()).orElse(defaultUserName);

            String userName = receivedUserName.replaceAll("\\s+", "").toLowerCase();

            System.out.println("userName is " + userName);

            CreateUserRequestDTO createUserRequest = new CreateUserRequestDTO(userName);
            createUserRequest.setEmail(response.getUserName());
            createUserRequest.setLanguage(CreateUserRequestDTO.LanguageEnum.EN_US);
            createUserRequest.setLocale(CreateUserRequestDTO.LocaleEnum.EN_US);

            Response getApiResponse = userServiceClient.getUserByUserName(userName);

            if (getApiResponse.getStatusCode() == 200 && getApiResponse.as(GetUsersResponseDTO.class).getUsers().isEmpty()) {
                UserLinkRoleDTO linkRoleDTO = new UserLinkRoleDTO(tenantId);
                linkRoleDTO.setLinkRole(UserLinkRoleDTO.LinkRoleEnum.LINK_ADMIN);
                linkRoleDTO.setIdp(UserLinkRoleDTO.IdpEnum.TABLEAUIDWITHMFA);
                linkRoleDTO.setNotifyUser(true);
                createUserRequest.addLinkRolesItem(linkRoleDTO);
                System.out.println("Adding link role as well: " + siteId);
            }

            if (response.getSite() != null) {
                System.out.println(response.getSite());
                siteId = SiteMap.getSiteId(response.getSite());
                UserSiteRoleDTO siteRoleDTO = new UserSiteRoleDTO(siteId);
                siteRoleDTO.setSiteRole(UserSiteRoleDTO.SiteRoleEnum.SITEADMINISTRATORCREATOR);
                siteRoleDTO.setIdp(UserSiteRoleDTO.IdpEnum.TABLEAUIDWITHMFA);
                siteRoleDTO.setNotifyUser(true);
                createUserRequest.addSiteRolesItem(siteRoleDTO);
                System.out.println("Adding user '" + receivedUserName + "' to site: " + siteId);
            }

            Response apiResponse = userServiceClient.fireCreateUserAndReturnOnJobSuccess(createUserRequest);
            if (apiResponse.getStatusCode() != 202) {
                System.out.println(apiResponse);
                ApiErrorResponse errResponse = apiResponse.as(ApiErrorResponse.class);
                return "Unable to create user because " + errResponse.getMessage();
            }

            UserAckResponse userAckResponse = apiResponse.as(UserAckResponse.class);

            BulkUserOpDetails jobDetails = userServiceClient.pollJobAndReturnOnCompletion(150, 600,
                    userAckResponse.getJobId());

            if (jobDetails.getStatus() == BulkUserOpDetails.StatusEnum.FAILED) {
                return "User addition failed because: " + jobDetails.getItems();
            } else if (jobDetails.getStatus() == BulkUserOpDetails.StatusEnum.SUCCESSFUL) {
                if (response.getSite() != null) {
                    return "User successfully added to site " + response.getSite();
                } else {
                    return "User successfully added to tenant.";
                }
            }

            return "User addition took too much time. Try again on another site.";
        }

        void testFireCreateUserOnSiteUI() throws Exception {
            ImportExternalUsersResponse result = userServiceClient.importExternalUser(defaultUserName, "ExplorerCanPublish",
                    "SAML");
        }
}