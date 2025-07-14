package com.tableausoftware.core.dao;

import com.tableausoftware.core.basedao.BaseDaoJpa;
import com.tableausoftware.core.entity.ConversationHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA implementation of IConversationHistoryDao
 *
 * @author system
 */
@Repository
public class ConversationHistoryDao extends BaseDaoJpa<ConversationHistory> implements IConversationHistoryDao {

    /**
     * Constructor
     */
    public ConversationHistoryDao() {
        super(ConversationHistory.class);
    }

    @Override
    public ConversationHistory addConversation(ConversationHistory conversationHistory) {
        persist(conversationHistory);
        return conversationHistory;
    }

    @Override
    public List<ConversationHistory> getLatestConversations(int limit) {
        String nativeQuery = "SELECT * FROM conversation_history ORDER BY m_created_at DESC LIMIT ?1";
        return executeNativeQuery(nativeQuery, limit);
    }

    @Override
    public List<ConversationHistory> getLatestConversationsBySession(String sessionId, int limit) {
        String nativeQuery = "SELECT * FROM conversation_history WHERE session_id = ?1 ORDER BY m_created_at DESC LIMIT ?2";
        return executeNativeQuery(nativeQuery, sessionId, limit);
    }

    @Override
    public List<ConversationHistory> getLatestConversationsByUser(String userId, int limit) {
        String nativeQuery = "SELECT * FROM conversation_history WHERE user_id = ?1 ORDER BY m_created_at DESC LIMIT ?2";
        return executeNativeQuery(nativeQuery, userId, limit);
    }

    private List<ConversationHistory> executeNativeQuery(String nativeQuery, Object... parameters) {
        jakarta.persistence.Query query = getEntityManager().createNativeQuery(nativeQuery, ConversationHistory.class);
        
        // Set parameters (native queries use 1-based indexing)
        for (int i = 0; i < parameters.length; i++) {
            query.setParameter(i + 1, parameters[i]);
        }
        
        @SuppressWarnings("unchecked")
        List<ConversationHistory> results = query.getResultList();
        return results;
    }

    private jakarta.persistence.EntityManager getEntityManager() {
        return super.m_entityManager;
    }
} 