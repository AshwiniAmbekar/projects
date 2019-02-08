package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Movie;
import com.lti.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@Transactional
	public void add(Movie movie) {
		movieRepo.add(movie);
	}
	
	public Movie fetch(int id) {
		return movieRepo.fetch(id);
	}
}
