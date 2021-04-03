package org.byte2code.pohdequest.persistence.dao.jpa;

import org.byte2code.pohdequest.persistence.dao.UserDao;
import org.byte2code.pohdequest.persistence.model.User;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link UserDao} implementation
 */
@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaUserDao() {
        super(User.class);
    }
}
