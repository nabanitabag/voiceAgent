package com.tableausoftware.core.dto.response;

import com.tableausoftware.core.dto.common.UserIntent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntentClassificationResponse {
    private UserIntent action;
    private String site;
    private String userName;
    private String followUp;
}
