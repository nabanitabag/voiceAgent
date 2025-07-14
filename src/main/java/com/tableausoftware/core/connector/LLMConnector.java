package com.tableausoftware.core.connector;

import com.tableausoftware.core.configuration.LLMConfig;
import com.tableausoftware.core.dto.request.LLMRequest;
import com.tableausoftware.core.dto.response.LLMResponse;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;




@Service
public class LLMConnector {

    private final RestTemplate restTemplate;
    private final LLMConfig llmConfig;
    private static final String AUTH_HEADER = "Authorization";
    private static final String X_CLIENT_FEATURE_ID = "x-client-feature-id";
    private static final String X_SFDC_APP_CONTEXT = "x-sfdc-app-context";
    private static final String X_SFDC_CORE_TENANT_ID = "x-sfdc-core-tenant-id";

    public LLMConnector(LLMConfig llmConfig) {
        this.restTemplate = RestTemplateFactory.create();
        this.llmConfig = llmConfig;
    }

    public LLMResponse sendRequest(String prompt) {
        // 1. Set the custom headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(AUTH_HEADER, llmConfig.getApiKey());
        headers.set(X_CLIENT_FEATURE_ID, llmConfig.getFeatureId());
        headers.set(X_SFDC_APP_CONTEXT, llmConfig.getAppContext());
        headers.set(X_SFDC_CORE_TENANT_ID, llmConfig.getTenantId());

        // 2. Wrap the request and headers
        LLMRequest request = new LLMRequest(llmConfig.getModel(),prompt);
        HttpEntity<LLMRequest> entity = new HttpEntity<>(request, headers);

        String endPoint = llmConfig.getEndPoint() + "/v1.0/generations";

        // 3. Make the POST request
        ResponseEntity<LLMResponse> response = restTemplate.postForEntity(endPoint, entity, LLMResponse.class);

        // 4. Return the response body
        return response.getBody();
    }


}

