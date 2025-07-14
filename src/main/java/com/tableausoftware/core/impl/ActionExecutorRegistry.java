package com.tableausoftware.core.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tableausoftware.core.dto.common.UserIntent;
import com.tableausoftware.core.dto.response.ChatResponse;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class ActionExecutorRegistry {

    private final Map<UserIntent, IntentExecutor> executorMap = new EnumMap<>(UserIntent.class);

    public ActionExecutorRegistry(List<IntentExecutor> executors) {
        // register manually or via instanceof
        for (IntentExecutor executor : executors) {
            if (executor instanceof AddUserExecutor) {
                executorMap.put(UserIntent.ADD_USER, executor);
            } else if (executor instanceof DeleteUserExecutor) {
                executorMap.put(UserIntent.DELETE_USER, executor);
            } else if (executor instanceof DisambiguationExecutor) {
                executorMap.put(UserIntent.DISAMBIGUATE, executor);
            } else if (executor instanceof ChitChatExecutor) {
                executorMap.put(UserIntent.CHIT_CHAT, executor);
            } else if (executor instanceof GetUsersExecutor) {
                executorMap.put(UserIntent.GET_USERS, executor);
             }
        }
    }

    public String executeAction(IntentClassificationResponse response) throws JsonProcessingException {
        IntentExecutor executor = executorMap.get(response.getAction());
        if (executor != null) {
            return executor.execute(response);
        } else {
            throw new IllegalArgumentException("No executor found for action: " + response.getAction());
        }
    }
}