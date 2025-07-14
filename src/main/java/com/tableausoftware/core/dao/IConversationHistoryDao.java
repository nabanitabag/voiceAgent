package com.tableausoftware.core.dao;

import com.tableausoftware.core.basedao.IBaseDao;
import com.tableausoftware.core.entity.ConversationHistory;

import java.util.List;

/**
 * DAO interface encapsulating methods for manipulation/viewing of ConversationHistory
 *
 * @author system
 *
 */
public interface IConversationHistoryDao extends IBaseDao<ConversationHistory> {

    /**
     * Add a new conversation entry
     * @param conversationHistory the conversation entry to add
     * @return the saved conversation history entity
     */
    ConversationHistory addConversation(ConversationHistory conversationHistory);

    /**
     * Fetch the latest n conversations ordered by creation date descending
     * @param limit number of conversations to fetch
     * @return list of latest conversations
     */
    List<ConversationHistory> getLatestConversations(int limit);

    /**
     * Fetch the latest n conversations for a specific session
     * @param sessionId the session ID to filter by
     * @param limit number of conversations to fetch
     * @return list of latest conversations for the session
     */
    List<ConversationHistory> getLatestConversationsBySession(String sessionId, int limit);

    /**
     * Fetch the latest n conversations for a specific user
     * @param userId the user ID to filter by
     * @param limit number of conversations to fetch
     * @return list of latest conversations for the user
     */
    List<ConversationHistory> getLatestConversationsByUser(String userId, int limit);
} 