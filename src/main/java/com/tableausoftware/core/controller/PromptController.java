package com.tableausoftware.core.controller;

import com.tableausoftware.core.dto.request.PromptRequest;
import com.tableausoftware.core.dto.response.PromptResponse;
import com.tableausoftware.core.service.PromptService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prompt")
public class PromptController {

    private final PromptService promptService;

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    @RequestMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PromptResponse createPrompt(@RequestBody PromptRequest createPromptRequest){
        try{
            return promptService.createPrompt(createPromptRequest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping(value="/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PromptResponse updatePrompt(@RequestBody PromptRequest updatePromptRequest){
        try{
            return promptService.updatePrompt(updatePromptRequest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
