package com.tableausoftware.core.basedao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import jakarta.persistence.EntityManager;
import jakarta.persistence.LockModeType;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import org.springframework.transaction.annotation.Isolation;

import com.google.common.base.Preconditions;

/**
 * JPA-specific implementation of the IBaseDao interface,
 * providing data access methods commonly used by all
 * workgroup entities.
 *
 * Entity-specific data access objects extend this class
 * to provide common shared DAO operations.
 *
 * @author vbuddha
 *
 */
public abstract class BaseDaoJpa<T extends Serializable> implements IBaseDao<T> {

    protected static final Function<Object, Integer> S_OBJECT_TO_INTEGER_FUNCTION = obj -> ((Number) obj).intValue();
    protected static final Function<Object, Long> S_OBJECT_TO_LONG_FUNCTION = obj -> ((Number) obj).longValue();

    /**
     * The JPA EntityManager instance, used to perform
     * all JPA actions on entities.
     */
    @PersistenceContext
    protected EntityManager m_entityManager;

    /**
     * The entity class type, needed by the EntityManager
     * for generic operations on any entity type.
     */
    protected Class<T> m_type;

    /**
     * Constructor intended for concrete Dao classes, that initializes the
     * entity type T for use by the generic EntityManager operations.
     *
     */
    protected BaseDaoJpa(Class<T> type) {
        m_type = type;
    }

    /**
     * @see com.tableausoftware.core.basedao.IBaseDao#findById(int)
     */
    @Override
    public T findById(int id) {
        return m_entityManager.find(m_type, id);
    }

    /**
     * @see com.tableausoftware.core.basedao.IBaseDao#findById(int, LockModeType)
     */
    @Override
    public T findById(int id, LockModeType lockMode) {
        return m_entityManager.find(m_type, id, lockMode);
    }

    /**
     * Queries for a single entity result. If the query results in multiple rows,
     * a NonUniqueResultException is thrown.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A single entity object, or null if the query returns zero results.
     */
    protected T queryForSingleResult(String query, Object ... parameters) {
        return queryForSingleResult(query, HibernateQueryCachingHint.DISABLED, parameters);
    }

    /**
     * Queries for a single entity result. If the query results in multiple rows,
     * a NonUniqueResultException is thrown.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param cacheQuery Sets hibernate hint to cache id's returns by the query.
     *                   Used if the table is in the hibernate second level cache
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A single entity object, or null if the query returns zero results.
     */
    protected T queryForSingleResult(String query, HibernateQueryCachingHint cacheQuery, Object ... parameters) {
        TypedQuery<T> typedQuery = m_entityManager.createQuery(query, m_type);
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            typedQuery.setParameter(i, parameters[i-1] );
        }
        if(cacheQuery == HibernateQueryCachingHint.ENABLED) {
            typedQuery.setHint("org.hibernate.cacheable", "true");
        }
        List<T> results = typedQuery.getResultList();
        return singleResultFromList(results);
    }

    protected T singleResultFromList(List<T> results) {
        if (results.size() == 0) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            // More than one result, throw exception.
            throw new NonUniqueResultException();
        }
    }


    /**
     * Queries for the top (i.e. first) entity in the result set. The advantage over
     * queryForSingleResult is that it can run faster, since it doesn't need to fetch
     * all results.  It might be especially useful when you want to return the top result
     * in some ordered result set  However, queryForSingleResult should be preferred when
     * returning multiple results should actually be flagged as an error.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A single entity object, or null if the query returns zero results.
     */
    protected T queryForTop1Result(String query, Object ... parameters) {
        TypedQuery<T> typedQuery = m_entityManager.createQuery(query, m_type);
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            typedQuery.setParameter(i, parameters[i-1] );
        }
        typedQuery.setMaxResults(1);
        List<T> results = typedQuery.getResultList();
        if (results.size() == 0) {
            return null;
        } else {
            return results.get(0);
        }
    }

    /**
     * Queries for multiple results.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query. Returns empty list if not found.
     */
    protected List<T> queryForMultipleResults(String query, Object ... parameters) {
        return queryForNResults(query, null, parameters);
    }

    /**
     * Queries for multiple results.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query. Returns empty list if not found.
     */
    protected List<T> queryForNResults(String query, Integer maxResults, Object ... parameters) {
        return queryForNResults(query, maxResults, HibernateQueryCachingHint.DISABLED, parameters);
    }

    /**
     * Queries for multiple results.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param maxResults Total number of results to return. Ignored if null.
     * @param cacheQuery Sets hibernate hint to cache id's returns by the query.
     *                   Used if the table is in the hibernate second level cache
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query. Returns empty list if not found.
     */
    protected List<T> queryForNResults(String query, Integer maxResults,
                                       HibernateQueryCachingHint cacheQuery, Object ... parameters) {
        TypedQuery<T> typedQuery = m_entityManager.createQuery(query, m_type);
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            typedQuery.setParameter(i, parameters[i-1] );
        }

        if(cacheQuery == HibernateQueryCachingHint.ENABLED) {
            typedQuery.setHint("org.hibernate.cacheable", "true");
        }

        if (maxResults != null) {
            typedQuery.setMaxResults(maxResults);
        }

        return typedQuery.getResultList();
    }

    /**
     * Queries for multiple results.
     *
     * @param firstResult Zero based index of first result to return. Ignored if null.
     * @param maxResults Total number of results to return. Ignored if null.
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query.
     */
    protected List<T> queryForMultipleResultsPaged(Integer firstResult,
                                                   Integer maxResults, String query, Object... parameters) {
        TypedQuery<T> typedQuery = m_entityManager.createQuery(query, m_type);
        if (maxResults != null) {
            if (maxResults == 0) {
                return new ArrayList<>();
            }
            typedQuery.setMaxResults(maxResults);
        }
        if (firstResult != null) {
            typedQuery.setFirstResult(firstResult);
        }
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            typedQuery.setParameter(i, parameters[i - 1]);
        }
        return typedQuery.getResultList();
    }

    /**
     * Queries natively for multiple results.  This should only be used as a last resort
     * if there is a JPA/Hibernate limitation.
     *
     * @param query The native query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query.
     */
    protected List<T> queryForMultipleResultsNative(String query, Object ... parameters) {
        return queryForNResultsNative(query, null, parameters);
    }

    /**
     * Queries for multiple results.
     *
     * @param query The native query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return A list of entity objects returned from the query. Returns empty list if not found.
     */
    @SuppressWarnings("unchecked")
    private List<T> queryForNResultsNative(String query, Integer maxResults, Object ... parameters) {
        Query queryObj = m_entityManager.createNativeQuery(query, m_type);
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            queryObj.setParameter(i, parameters[i-1] );
        }

        if (maxResults != null) {
            queryObj.setMaxResults(maxResults);
        }

        return queryObj.getResultList();
    }


    /**
     * Queries for a count. The query ***must*** be such that it will only return a count.
     * If your query does not do this, then don't use this method.
     *
     * @param query The JPQL query to execute; parameters must be indexed, not named.
     * @param parameters Zero or more query parameter values to apply to the query.
     * @return The count returned by the query
     */
    protected Long queryForCount(String query, Object ... parameters) {
        TypedQuery<Long> typedQuery = m_entityManager.createQuery(query, Long.class);
        // JPQL indexed parameters start at 1, not 0
        for (int i = 1; i <= parameters.length; i++) {
            typedQuery.setParameter(i, parameters[i-1] );
        }

        // Since exactly 1 result will be returned, there is no reason to worry about exceptions below
        return typedQuery.getSingleResult();
    }

    private static <P, T> ParameterExpression<P> bind(List<Consumer<TypedQuery<T>>> params,
                                                      CriteriaBuilder builder,
                                                      Class<P> paramType, Object argument) {
        ParameterExpression<P> param = builder.parameter(paramType);
        P castArgument = paramType.cast(argument);
        params.add((query) -> query.setParameter(param, castArgument));
        return param;
    }

    /**
     * Finds, in the database, an object, matching the one described by the parameters.
     * If it can't find one it returns null.
     * Note: this only works on entities whose fields are all defined as objects, and
     * it assumes that it has an id field.
     *
     * @param fieldInfoArray An array with as many rows as fields to be compared for equality.
     * The first column is the name of the field as JPQL would recognize it, while the second
     * is the value of that field in the entity that this is invoked on.
     * @return An entity, persisted in the db, that is identical in the specified fields to
     * the entity on which this method was invoked, or null if none can be found.
     */
    protected T findMatchByFields(Object[][] fieldInfoArray) {
        if (fieldInfoArray == null || fieldInfoArray.length < 1) {
            return null;
        }

        CriteriaBuilder builder = m_entityManager.getCriteriaBuilder();
        CriteriaQuery<T> select = builder.createQuery(m_type);
        Root<T> root = select.from(m_type);
        List<Consumer<TypedQuery<T>>> params = new ArrayList<>();

        select.where(Arrays.stream(fieldInfoArray).map(field -> {
            String fieldName = field[0].toString();
            Object fieldValue = field[1];
            if (fieldValue != null) {
                return builder.equal(root.get(fieldName), bind(params, builder, fieldValue.getClass(), fieldValue));
            } else {
                return builder.isNull(root.get(fieldName));
            }
        }).toArray(Predicate[]::new));

        select.orderBy(builder.asc(root.get("id")));

        // The query string is now ready
        TypedQuery<T> typedQuery = m_entityManager.createQuery(select);
        for (Consumer<TypedQuery<T>> param : params) {
            param.accept(typedQuery);
        }
        typedQuery.setMaxResults(1);

        List<T> results = typedQuery.getResultList();
        if (results.size() == 0) {
            return null;
        } else {
            return results.get(0);
        }
    }

    // turns [1, 2] to "ARRAY[1, 2]";
    protected String toPgIntArray(List<Integer> inputs) {
        StringBuilder sb = new StringBuilder("ARRAY[");

        int size = inputs.size();
        for (int i = 0 ; i < size - 1; i++) {
            Integer input = inputs.get(i);
            sb.append(input.toString());
            sb.append(", ");
        }
        sb.append(inputs.get(size - 1).toString());

        return sb.append("]").toString();
    }

    // given 1 and 4 returns something like
    // (?1, ?2, ?3, ?4)
    protected String getInsertClause(int startParamIndex, int numOfClause) {
        Preconditions.checkArgument(numOfClause > 0 && startParamIndex > 0,
                "The number of the clauses and starting index have to be positive");

        StringBuilder insertClause = new StringBuilder("(?");

        for (int num = 0; num < numOfClause - 1; num++) {
            insertClause.append(startParamIndex++);
            insertClause.append(", ?");
        }
        insertClause.append(startParamIndex);

        insertClause.append(")");

        return insertClause.toString();
    }

    @Override
    public void persist(T object) {
        m_entityManager.persist(object);
    }

    @Override
    public T merge(T object) {
        return m_entityManager.merge(object);
    }

    @Override
    public void refresh(T object) {
        m_entityManager.refresh(object);
    }

    @Override
    public boolean deleteById(int id) {
        CriteriaBuilder builder = m_entityManager.getCriteriaBuilder();

        CriteriaDelete<T> delete = builder.createCriteriaDelete(m_type);
        Root<T> root = delete.from(m_type);
        delete.where(builder.equal(root.get("id"), id));

        if (m_entityManager.createQuery(delete).executeUpdate() != 0) {
            // The entity manager (caching layer between us and Postgres)
            // doesn't seem to realize that we've deleted something.  Let it know.
            Object cachedMetric = m_entityManager.find(m_type, id);
            if (cachedMetric != null) {
                m_entityManager.detach(cachedMetric);
            }
            return true;
        }

        // We didn't find any values to delete.
        return false;
    }

    @Override
    public List<T> findByIds(Collection<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return Collections.emptyList();
        }

        // Sometimes it's just one thing, in which case we should use findById and hope we get a cache hit.
        HashSet<Integer> deduped = new HashSet<>(ids);

        if (deduped.size() == 1) {
            return deduped.stream()
                    .map(this::findById)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }

        CriteriaBuilder builder = m_entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(m_type);
        Root<T> root = query.from(m_type);

        query.select(root)
                .where(root.get("id").in(deduped));

        return m_entityManager.createQuery(query).getResultList();
    }

    @Override
    public long getAllCount() {
        CriteriaBuilder builder = m_entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<T> root = query.from(m_type);

        query.select(builder.count(root));

        return m_entityManager.createQuery(query).getSingleResult();
    }

    protected enum HibernateQueryCachingHint {
        ENABLED,
        DISABLED
    }


    /**
     * Executes the provided query.
     * Returns a map containing an entry for each row returned from the query
     * of the value of the first column to the value of the second.
     *
     * @param queryString query to execute, may take positional parameters
     * @param kTransformFunction function to transform the key from Object to K
     * @param vTransformFunction function to transform the value from Object to V
     * @param parameters positional parameters
     * @param <K> key type
     * @param <V> value type
     * @return map (K -> V) with the first 2 entries in each row returned from the query
     */
    protected <K, V> Map<K, V> queryForMap(String queryString,
                                           Function<Object, K> kTransformFunction,
                                           Function<Object, V> vTransformFunction,
                                           Object ... parameters) {
        Map<K, V> resultMap = new HashMap<>();
        Query query = m_entityManager.createQuery(queryString);
        for (int i = 0; i < parameters.length; i++) {
            query.setParameter(i + 1, parameters[i]);
        }

        for (Object result : query.getResultList()) {
            Object[] row = (Object[]) result;
            resultMap.put(kTransformFunction.apply(row[0]), vTransformFunction.apply(row[1]));
        }

        return resultMap;
    }

    /**
     * Sets the transaction isolation level at the current transaction scope. This
     * differs from the @Transactional annotation which does it for the session.
     *
     * @param isolationLevel a TransactionLevel enum
     */
    @Override
    public void setTransactionLevel(Isolation isolationLevel) {
        // direct mapping since the builtin ones don't produce the correct syntactic SQL
        String isolationLevelStr = "READ COMMITED";
        if (isolationLevel == Isolation.READ_COMMITTED) {
            isolationLevelStr = "READ COMMITED";
        } else if (isolationLevel == Isolation.REPEATABLE_READ) {
            isolationLevelStr = "REPEATABLE READ";
        } else if (isolationLevel == Isolation.SERIALIZABLE) {
            isolationLevelStr = "SERIALIZABLE";
        } else if (isolationLevel == Isolation.READ_UNCOMMITTED) {
            isolationLevelStr = "READ UNCOMMITTED";
        } else {
            Preconditions.checkState(false, "Unknown isolation level " + isolationLevel.toString());
        }

        // named parameters don't work so we'll directly set the sql string. Input is constrained by the enum
        // so SQL injection is not possible
        Query query = m_entityManager.createNativeQuery("SET TRANSACTION ISOLATION LEVEL " + isolationLevelStr);
        query.executeUpdate();
    }
}