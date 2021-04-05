package org.byte2code.pohdequest.services;

import org.byte2code.pohdequest.persistence.model.Podcast;

public interface PodcastService {

  /**
   * Gets the podcast with the given query
   *
   * @param query the podcast title
   */
  void fetch(String query);
}