package com.tableausoftware.core.dao;

import com.tableausoftware.core.basedao.IBaseDao;
import com.tableausoftware.core.entity.LLMPrompt;

/**
 * DAO class encapsulating methods for manipulation/viewing of Prompts
 *
 * @author vbuddha
 *
 */
public interface IPromptDao extends IBaseDao<LLMPrompt> {

    /**
     * Find a prompt by
     */
    LLMPrompt findByName(String name);
}
