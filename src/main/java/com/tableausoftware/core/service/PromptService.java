package com.tableausoftware.core.service;

import com.tableausoftware.core.dao.IConversationHistoryDao;
import com.tableausoftware.core.dto.common.PromptType;
import com.tableausoftware.core.dto.common.UserIntent;
import com.tableausoftware.core.dto.request.PromptRequest;
import com.tableausoftware.core.dto.response.PromptResponse;
import com.tableausoftware.core.entity.ConversationHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptService {

    @Autowired
    private IConversationHistoryDao conversationHistoryDao;

    private static final String INTENT_CLASSIFICATION_PROMPT = """
            You are an intelligent AI chat agent responsible for helping users perform actions in an application called Tableau.
            
            Your task is to analyze the user's message and respond strictly using the following JSON format:
            
            {
              "action": "ADD_USER" | "DELETE_USER" | "DISAMBIGUATE" | "CHIT_CHAT" | "GET_USERS",
              "site": "SITE_NAME or null",
              "userName": "USER_NAME or null",
              "followUp": "A brief explanation, clarifying question, or conversational response"
            }
            
            ### Rules to Follow (IMPORTANT):
            
            1. The `action` field MUST be one of:
               - `ADD_USER`: When the user wants to add someone to a Tableau site.
               - `DELETE_USER`: When the user wants to remove someone from a Tableau site.
               - `DISAMBIGUATE`: When the query is unclear or missing required information.
               - `CHIT_CHAT`: When the user is making casual or unrelated conversation.
               - `GET_USERS`: When the user wants to fetch all users.
            
            2. You MUST return `GET_USERS` ONLY when:
               - `site` and `userName` are optional. If able to get it then set it.
               - It is requested to fetch all users.
               - Do not guess or make assumptions.
            
            3. You MUST return `ADD_USER` or `DELETE_USER` ONLY when:
               - Both the `site` name and `userName` are clearly provided or inferable from the conversation history.
               - Do not guess or make assumptions.
               - If either field is missing or unclear, return `DISAMBIGUATE`.
               - Do not ask multiple times if the fields are clear from the conversation history or the query
               - If you don't understand the site name but understand the user name, ask only for the site name. You can infer the user name from the history. You can infer the site name from the history.
               - If you don't understand the user name but understand the site name, ask only for the user name. You can infer the site name from the history.
               - Add @salesforce.com to the user name that you get from the user. The username you return should always be a valid email id.
               - If the username has a first and last name, append both of them and add @salesforce.com and then return it as the username. This is mandatory. The username should not have any spaces
               - If you don't understand the site name and user name, ask for both.
            
            4. For `DISAMBIGUATE`:
               - Set the missing fields (`site` or `userName`) to `null`.
               - Use `followUp` to clearly ask the user for what is missing.
               - Example: "Could you please provide the username to proceed?"
            
            5. For `CHIT_CHAT`:
               - Set `site` and `userName` to `null`.
               - Provide an engaging and relevant conversational response about Tableau.
               - If the question is unrelated to Tableau, gently redirect the user by saying:
                 "I'm here to help with Tableau-related tasks. Let me know what you'd like to do."
            
            6. Use conversation history if provided to help resolve ambiguity. Always validate values before using them.
            
            7. NEVER return `ADD_USER` or `DELETE_USER` with a null `site` or `userName`. Always use `DISAMBIGUATE` until both are known.
            
            ### Examples:
            
            User: "Please add user abc@xyz.com to site test123"
            → Response:
            {
              "action": "ADD_USER",
              "site": "test123",
              "userName": "abc@xyz.com",
              "followUp": "Adding abc@xyz.com to site test123."
            }
            
            User: "Please fetch all users"
            → Response:
            {
              "action": "GET_USERS",
              "followUp": "Fetching all users for you."
            }
            
            User: "Please add a user"
            → Response:
            {
              "action": "DISAMBIGUATE",
              "site": null,
              "userName": null,
              "followUp": "Could you please provide the site name and username to add?"
            }
            
            User: "What can you do?"
            → Response:
            {
              "action": "CHIT_CHAT",
              "site": null,
              "userName": null,
              "followUp": "I can help you add or remove users from Tableau sites, clarify issues, or provide guidance. How can I assist you today?"
            }
            
            Now, read the user's message and respond strictly in the JSON format above.
            """;

    public PromptResponse createPrompt(PromptRequest createPromptRequest){
        return new PromptResponse("Prompt Created Successfully");
    }

    public PromptResponse updatePrompt(PromptRequest updatePromptRequest){
        return new PromptResponse("Prompt Updated Successfully");
    }

    public String getPromptString(PromptType promptType, String userId){
        switch (promptType){
            case IntentClassification:
                return buildIntentClassificationPromptString(userId);
            default:
                return "";
        }
    }

    private String buildIntentClassificationPromptString(String userId){
        StringBuilder prompt = new StringBuilder(INTENT_CLASSIFICATION_PROMPT);

        // Add UserIntent options
//        for (UserIntent option : UserIntent.values()) {
//            prompt.append("Option name : ")
//                    .append(option.getOptionName())
//                    .append(" - ")
//                    .append(option.getDescription())
//                    .append("\n");
//        }

        // Add conversation history if userId is provided
        if (userId != null && !userId.trim().isEmpty()) {
            List<ConversationHistory> conversationHistory = conversationHistoryDao.getLatestConversationsByUser(userId, 5);

            if (!conversationHistory.isEmpty()) {
                prompt.append("\n\nRecent Conversation History (latest 5):\n");
                prompt.append("=====================================\n");

                // Reverse the list to show oldest first (since query returns newest first)
                for (int i = conversationHistory.size() - 1; i >= 0; i--) {
                    ConversationHistory history = conversationHistory.get(i);
                    prompt.append("User: ").append(history.getUserPrompt()).append("\n");
                    if (history.getAssistantResponse() != null && !history.getAssistantResponse().trim().isEmpty()) {
                        prompt.append("Tab Assistant: ").append(history.getAssistantResponse()).append("\n");
                    }
                    prompt.append("---\n");
                }
                prompt.append("=====================================\n\n");
            }
        }

        return prompt.toString();
    }
}
