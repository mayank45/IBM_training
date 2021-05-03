package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.demo.entities.Movie;

@RestController
@RequestMapping("/show")
@EnableCircuitBreaker
public class BookMyShowController {

	@Autowired
	RestTemplate restTemplate;
	
//	localhost:8990/show/findAllMovies
	@GetMapping("/findAllMovies")
	// @HystrixCommand(fallbackMethod = "findMoviesFallback")
	@HystrixCommand(fallbackMethod = "findMoviesFallback",
		commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "2000"),
			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
			@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "90"),
			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000")
		}
	)
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


	public List<Movie> findMoviesFallback(){
		Movie movie = new Movie();
		movie.setId(99);
		movie.setRating(5);
		movie.setTitle("Superman");

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie);
		return movies;
	}


}
