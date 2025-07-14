package com.tableausoftware.core.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "llm")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LLMConfig {
    private String model;
    private String apiKey;
    private String endPoint;
    private String featureId;
    private String appContext;
    private String tenantId;
}
