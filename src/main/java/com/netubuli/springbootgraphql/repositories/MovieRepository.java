package com.netubuli.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netubuli.springbootgraphql.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	 Movie findFirstMovieByMovieName(String movieName);

}
