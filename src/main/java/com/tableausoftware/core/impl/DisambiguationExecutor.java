package com.tableausoftware.core.impl;

import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import org.springframework.stereotype.Service;

@Service
public class DisambiguationExecutor implements IntentExecutor {
    @Override
    public String execute(IntentClassificationResponse response) {
        System.out.println("Disambiguation response: " + response.getFollowUp());
        return response.getFollowUp();
    }
}
