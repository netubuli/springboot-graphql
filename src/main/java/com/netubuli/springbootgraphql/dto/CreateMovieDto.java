package com.netubuli.springbootgraphql.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CreateMovieDto {
	
	private String leadActoname;
	private String movieName;
	private String genre;
	private String producer;
	private Double imdbRating;


}
