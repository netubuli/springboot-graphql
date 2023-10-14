package com.netubuli.springbootgraphql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netubuli.springbootgraphql.dto.CreateMovieDto;
import com.netubuli.springbootgraphql.models.Movie;
import com.netubuli.springbootgraphql.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public List<Movie> fetchAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie fetchMoviebyName(String name) {
		// TODO Auto-generated method stub
		return movieRepository.findFirstMovieByMovieName(name);
	}

	@Override
	public Movie createMovie(CreateMovieDto createMovieDto) {
		Movie movie = new Movie();
		movie.setGenre(createMovieDto.getGenre());
		movie.setImdbRating(createMovieDto.getImdbRating());
		movie.setLeadActoname(createMovieDto.getLeadActoname());
		movie.setMovieName(createMovieDto.getMovieName());
		movie.setProducer(createMovieDto.getProducer());
		
		return movieRepository.save(movie);
	}

}
