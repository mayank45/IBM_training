package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.entities.Movie;

@RestController
@RequestMapping("/show")
public class BookMyShowController {

	@Autowired
	RestTemplate restTemplate;
	
//	localhost:8990/show/findAllMovies
	@GetMapping("/findAllMovies")
	public List<Movie> findMovies(){
		
		ResponseEntity<List<Movie>> response = restTemplate.exchange(
				"http://MOVIES-SERVICE/movies",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Movie>>() {});
		
		List<Movie> movies = response.getBody();
		
		System.out.println("in book my show");
		System.out.println("movie list");
		System.out.println(movies);
		
		return movies;
		
	}
}
