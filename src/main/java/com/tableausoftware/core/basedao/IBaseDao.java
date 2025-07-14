package com.tableausoftware.core.basedao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.LockModeType;

import org.springframework.transaction.annotation.Isolation;

/**
 * Base interface for data access, providing the interface for common
 * data access methods typically needed
 *
 * @author vbuddha
 *
 */
public interface IBaseDao<T extends Serializable> {
    /**
     * Retrieves an entity object from the database by id.
     *
     * @return entity object
     */
    T findById(int id);

    /**
     * Retrieves an entity object from the database by id and
     * locks the object at the same time
     */
    T findById(int id, LockModeType lockMode);

    /**
     * Saves the entity object to the database.
     *
     */
    void persist(T object);

    /**
     * Updates the entity in the database.  Returns the object for "chaining" convenience
     *
     */
    T merge(T object);

    /**
     * Refresh the state of the object from the database, overwriting changes made to entity
     *
     */
    void refresh(T object);

    /**
     * Delete an entity by ID.  Also keeps the entity manager clean.
     *
     * @return whether or not a row was found and deleted.
     */
    boolean deleteById(int id);

    /**
     * @param ids collection of ids to get
     * @return list of entities
     */
    List<T> findByIds(Collection<Integer> ids);

    /**
     * @return count of all entities in the server
     */
    long getAllCount();

    /**
     * Sets the per transaction, isolation level as opposed
     * to the JPA @Transactional isolation level which is per session
     *
     * @param level Isolation enum
     */
    void setTransactionLevel(Isolation level);
}
