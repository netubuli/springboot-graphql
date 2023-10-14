package com.netubuli.springbootgraphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netubuli.springbootgraphql.models.Movie;
import com.netubuli.springbootgraphql.repositories.MovieRepository;

@SpringBootApplication
public class SpringbootGraphqlApplication implements CommandLineRunner {

	@Autowired
	MovieRepository movieRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		m1.setGenre("Action");
		m1.setImdbRating(9.3);
		m1.setLeadActoname("chan");
		m1.setMovieName("war");
		m1.setProducer("Reddington");
		
		m2.setGenre("Romance");
		m2.setImdbRating(7.0);
		m2.setLeadActoname("noah");
		m2.setMovieName("in Love");
		m2.setProducer("nollywood");
		
		m3.setGenre("Drama");
		m3.setImdbRating(6.0);
		m3.setLeadActoname("Lopez");
		m3.setMovieName("Claws");
		m3.setProducer("Hollywood");
		
		movieRepository.save(m1);
		movieRepository.save(m2);
		movieRepository.save(m3);
		
		
	}

}
