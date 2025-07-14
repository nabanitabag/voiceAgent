package com.tableausoftware.core.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImportExternalUsersRequest {
    
    @JsonProperty("method")
    private String method;
    
    @JsonProperty("params")
    private ImportParams params;
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImportParams {
        @JsonProperty("userNames")
        private List<String> userNames;
        
        @JsonProperty("siteRole")
        private String siteRole;
        
        @JsonProperty("authSetting")
        private String authSetting;
    }
} 