package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.entity.Movie;
import com.lti.service.MovieService;

@RestController
@CrossOrigin
public class MovieController {
	
	@Autowired
	private MovieService movieServ;

	@RequestMapping(path = "/movie/add", method = RequestMethod.POST)
	public String add(@RequestBody Movie movie) {
		movieServ.add(movie);
		return "Movie records added successfully";
	}

	@RequestMapping(path = "/movie/{id}", method = RequestMethod.GET)
	public Movie fetch(@PathVariable("id") int id) {
		return movieServ.fetch(id);
	}
}
