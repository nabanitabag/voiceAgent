package com.tableausoftware.core.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tableausoftware.core.dto.common.Generation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LLMResponse {
    private List<Generation> generations;
}
