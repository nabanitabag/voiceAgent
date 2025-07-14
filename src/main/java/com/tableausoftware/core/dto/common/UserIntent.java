package com.tableausoftware.core.dto.common;

public enum UserIntent {

    ADD_USER("Represents a request to add a user to a specific site. If the site name is not provided or unclear in the query, use DISAMBIGUATE instead."),
    DELETE_USER("Represents a request to remove a user from a specific site. If the site name is missing or ambiguous, use DISAMBIGUATE instead."),
    DISAMBIGUATE("Use this when the user's query is unclear or lacks required information (e.g., site name). Ask for clarification in the followUp field."),
    CHIT_CHAT("Use this when the query is casual conversation or general chat, unrelated to any Tableau site action" +
            ". Respond conversationally in the followUp field. If the question is general question related to Tableau, use your " +
            "world wide knowledge to answer it. If not, remind the user that you can help only with Tableau related Queries"),
    GET_USERS("Represents a request to get all the users of a specific tenant.");

    private final String description;

    UserIntent(String description) {
        this.description = description;
    }

    public String getOptionName() {
        return this.name();
    }

    public String getDescription() {
        return description;
    }
}

