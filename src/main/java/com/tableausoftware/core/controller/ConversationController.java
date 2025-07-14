package com.tableausoftware.core.controller;

import com.tableausoftware.core.dto.request.ChatRequest;
import com.tableausoftware.core.dto.response.ChatResponse;
import com.tableausoftware.core.service.ConversationService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversation")
public class ConversationController {
    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @PostMapping(value = "/query", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ChatResponse converse(@RequestBody ChatRequest request){
        try{
            return conversationService.converse(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Tab Conversation service is up and running");
    }
}
