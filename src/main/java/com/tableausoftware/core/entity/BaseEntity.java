package com.tableausoftware.core.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;


/**
 * Base class for most entities.
 *
 * @author vbuddha
 *
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    // Common entity fields
    @Temporal(TemporalType.TIMESTAMP)
    protected Date m_createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date m_updatedAt;

    @Version
    private Integer version;

    protected boolean m_preserveUpdatedAt = false;

    @PrePersist
    protected void onCreate() {
        Date now = new Date();
        m_createdAt = now;
        m_updatedAt = now;
    }

    @PreUpdate
    protected void onUpdate() {
        if(!m_preserveUpdatedAt) {
            m_updatedAt = new Date();
        }
    }

    /**
     * Set the flag which preserves the value of the "updated_at" column as-is on update
     */
    public void setPreserveUpdatedAt() {
        m_preserveUpdatedAt = true;
    }

    /**
     * @return the createdAt
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    public Date getCreatedAt() {
        return m_createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        m_createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at")
    public Date getUpdatedAt() {
        return m_updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        m_updatedAt = updatedAt;
    }
}