package com.netubuli.springbootgraphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netubuli.springbootgraphql.services.MovieService;
import com.netubuli.springbootgraphql.dto.CreateMovieDto;
import com.netubuli.springbootgraphql.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping
	public List<Movie> getAllMovies(){
		return movieService.fetchAllMovies();
	}
	@GetMapping("/{moviename}")
	public Movie getMovieByMovieName(@PathVariable String moviename) {
		return movieService.fetchMoviebyName(moviename);
	}
	
	@PostMapping
	public Movie MakeMovieDto(@RequestBody CreateMovieDto movie) {
		return movieService.createMovie(movie);
		
	}
	

}
