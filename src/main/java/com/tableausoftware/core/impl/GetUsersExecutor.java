package com.tableausoftware.core.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import com.tableausoftware.core.model.*;
import com.tableausoftware.core.service.UserServiceClient;
import com.tableausoftware.core.utils.SiteMap;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GetUsersExecutor implements IntentExecutor {
    private final UserServiceClient userServiceClient = new UserServiceClient();

    @Override
    public String execute(IntentClassificationResponse response) throws JsonProcessingException {
        if (response.getUserName() != null) {
            List<UserDTO> users = userServiceClient.getUserByUserName(response.getUserName()).as(GetUsersResponseDTO.class).getUsers();
            if (users.isEmpty()) {
                return "No user found with this userName or site name.";
            }
            return "User successfully fetched. UserId is: " + users.get(0).getUserId();
        } else if (response.getSite() != null) {
            List<UserDTO> users = userServiceClient.getUsers();
            if (users.isEmpty()) {
                return "No user found on this site.";
            }

            System.out.println(response.getSite());
            UUID targetSiteId = SiteMap.getSiteId(response.getSite());

            List<UserDTO> filteredUsers = users.stream()
                    .filter(user -> user.getSiteRoles().stream()
                            .anyMatch(role -> targetSiteId.equals(role.getSiteId())))
                    .toList();



            List<String> usernames = filteredUsers.stream()
                    .map(UserDTO::getUserName)
                    .filter(Objects::nonNull)
                    .toList();

            System.out.println(usernames);

            if (!usernames.isEmpty()) {
                return "Users of site: " + response.getSite() + " are successfully fetched: " + usernames;
            } else {
                return "No users found on site: " + response.getSite();
            }
        }
        List<UserDTO> users = userServiceClient.getUsers();
        List<String> usernames = users.stream()
                .map(UserDTO::getUserName)
                .filter(Objects::nonNull)
                .toList();
        return "Users of the tenant are successfully fetched. Their usernames are: " + usernames;
    }
}