package org.byte2code.pohdequest.persistence.dao.jpa;

import org.springframework.stereotype.Repository;

/**
 * A JPA {@link AccountDao} implementation
 */
@Repository
public class JpaAccountDao extends GenericJpaDao<Account> implements AccountDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaAccountDao() {
        super(Subscriptions.class);
    }
}
