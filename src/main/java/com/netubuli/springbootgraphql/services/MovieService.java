package com.netubuli.springbootgraphql.services;

import java.util.List;

import com.netubuli.springbootgraphql.dto.CreateMovieDto;
import com.netubuli.springbootgraphql.models.Movie;

public interface MovieService {
	
	public List<Movie> fetchAllMovies();
	public Movie fetchMoviebyName(String name);
	public Movie createMovie(CreateMovieDto createMovieDto);
	

}
