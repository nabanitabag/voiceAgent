package com.tableausoftware.core.entity;

import com.tableausoftware.core.dto.common.UserIntent;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "ConversationHistory")
@Setter
@Getter
public class ConversationHistory extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "session_id", nullable = false)
    private String sessionId;

    @Column(name = "user_prompt", columnDefinition = "TEXT", nullable = false)
    private String userPrompt;

    @Column(name = "assistant_response", columnDefinition = "TEXT")
    private String assistantResponse;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_intent")
    private UserIntent userIntent;

    @Column(name = "user_id")
    private String userId;

    // Constructors
    public ConversationHistory() {}

    public ConversationHistory(String sessionId, String userPrompt) {
        this.sessionId = sessionId;
        this.userPrompt = userPrompt;
    }

    public ConversationHistory(String sessionId, String userPrompt, String assistantResponse) {
        this.sessionId = sessionId;
        this.userPrompt = userPrompt;
        this.assistantResponse = assistantResponse;
    }

} 