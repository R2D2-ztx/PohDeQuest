package org.byte2code.pohdequest.persistence.dao.jpa;

import org.byte2code.pohdequest.persistence.dao.PodcastDao;
import org.byte2code.pohdequest.persistence.model.Podcast;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link PodcastDao} implementation
 */
@Repository
public class JpaPodcastDao extends GenericJpaDao<Podcast> implements PodcastDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaPodcastDao() {
        super(Podcast.class);
    }
}
