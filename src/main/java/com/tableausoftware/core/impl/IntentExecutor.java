package com.tableausoftware.core.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tableausoftware.core.dto.response.ChatResponse;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;

public interface IntentExecutor {
    String execute(IntentClassificationResponse response) throws JsonProcessingException;
}
