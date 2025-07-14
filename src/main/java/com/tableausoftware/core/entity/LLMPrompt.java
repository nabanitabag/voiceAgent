package com.tableausoftware.core.entity;

import com.tableausoftware.core.dto.common.PromptType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "LLMPrompts")
@Setter
@Getter
public class LLMPrompt extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "promptName", nullable = false)
    private String promptName;

    @Column(name = "prompt", columnDefinition = "TEXT", nullable = false)
    private String prompt;

    @Column(name = "promptType", columnDefinition = "TEXT", nullable = false)
    private PromptType promptType;

    // Constructors
    public LLMPrompt() {}

    public LLMPrompt(String promptName, String prompt) {
        this.promptName = promptName;
        this.prompt = prompt;
    }

}
