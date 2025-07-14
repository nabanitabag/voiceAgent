package com.tableausoftware.core.dto.response;

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
public class ImportExternalUsersResponse {
    
    @JsonProperty("method")
    private String method;
    
    @JsonProperty("params")
    private ImportParams params;
    
    @JsonProperty("result")
    private ImportResult result;
    
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
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImportResult {
        @JsonProperty("success")
        private boolean success;
        
        @JsonProperty("message")
        private String message;
        
        @JsonProperty("importedUsers")
        private List<ImportedUser> importedUsers;
        
        @JsonProperty("failedUsers")
        private List<FailedUser> failedUsers;
        
        @JsonProperty("totalCount")
        private int totalCount;
        
        @JsonProperty("successCount")
        private int successCount;
        
        @JsonProperty("failureCount")
        private int failureCount;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImportedUser {
        @JsonProperty("userName")
        private String userName;
        
        @JsonProperty("email")
        private String email;
        
        @JsonProperty("siteRole")
        private String siteRole;
        
        @JsonProperty("authSetting")
        private String authSetting;
        
        @JsonProperty("userId")
        private String userId;
        
        @JsonProperty("status")
        private String status;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FailedUser {
        @JsonProperty("userName")
        private String userName;
        
        @JsonProperty("email")
        private String email;
        
        @JsonProperty("errorCode")
        private String errorCode;
        
        @JsonProperty("errorMessage")
        private String errorMessage;
        
        @JsonProperty("reason")
        private String reason;
    }
} 