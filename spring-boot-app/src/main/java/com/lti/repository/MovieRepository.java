package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.lti.entity.Movie;

@Repository
public class MovieRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public void add(Movie movie) {
		entityManager.persist(movie);
	}

	public Movie fetch(int id) {
		return entityManager.find(Movie.class, id);
	}
}
