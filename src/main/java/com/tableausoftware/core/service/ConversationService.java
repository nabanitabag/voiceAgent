package com.tableausoftware.core.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tableausoftware.core.connector.LLMConnector;
import com.tableausoftware.core.dao.IConversationHistoryDao;
import com.tableausoftware.core.dto.common.PromptType;
import com.tableausoftware.core.dto.request.ChatRequest;
import com.tableausoftware.core.dto.response.ChatResponse;
import com.tableausoftware.core.dto.response.IntentClassificationResponse;
import com.tableausoftware.core.dto.response.LLMResponse;
import com.tableausoftware.core.entity.ConversationHistory;
import com.tableausoftware.core.impl.ActionExecutorRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConversationService {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private PromptService promptService;

    @Autowired
    private LLMConnector llmConnector;

    @Autowired
    private ActionExecutorRegistry registry;

    @Autowired
    private IConversationHistoryDao conversationHistoryDao;

    @Transactional
    public ChatResponse converse(ChatRequest request) throws JsonProcessingException {
        //Step 1.Intent Classification
        String prompt = promptService.getPromptString(PromptType.IntentClassification, request.getUserId()) + "  "
                + request.getQuery();

        LLMResponse response = llmConnector.sendRequest(prompt);

        String llmResponse = response.getGenerations().stream().findFirst().get().getText();
        IntentClassificationResponse intentClassificationResponse = objectMapper.readValue(llmResponse, IntentClassificationResponse.class);

        String agentResponse = registry.executeAction(intentClassificationResponse);

        // Save conversation to history
        ConversationHistory conversationHistory = new ConversationHistory();
        conversationHistory.setSessionId(request.getUserId() + "-session"); // Use userId-based session ID
        conversationHistory.setUserId(request.getUserId());
        conversationHistory.setUserPrompt(request.getQuery());
        conversationHistory.setAssistantResponse(agentResponse);
        conversationHistory.setUserIntent(intentClassificationResponse.getAction());
        conversationHistoryDao.addConversation(conversationHistory);

        return new ChatResponse(agentResponse);

    }


}
