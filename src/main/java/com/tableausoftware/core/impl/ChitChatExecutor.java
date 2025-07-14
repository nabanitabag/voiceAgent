package com.tableausoftware.core.impl;

import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import org.springframework.stereotype.Service;

@Service
public class ChitChatExecutor implements IntentExecutor {
    @Override
    public String execute(IntentClassificationResponse response) {
        System.out.println("Chitchat response " + response.getFollowUp());
        return response.getFollowUp();
    }
}
