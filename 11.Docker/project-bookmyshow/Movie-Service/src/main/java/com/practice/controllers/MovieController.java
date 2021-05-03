package com.practice.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Exception.MovieNotFoundException;
import com.practice.entities.ErrorMessage;
import com.practice.entities.Movie;
import com.practice.services.MovieService;

@RestController
@RequestMapping("movies")
public class MovieController {
	
	@Autowired
	MovieService movieservice;
	
	@GetMapping("")
	public List<Movie> getAllMovie(){
		return movieservice.getAllMovie();
	}
	
	@GetMapping("/{id}")
	public Movie getMovieById(@PathVariable int id) throws MovieNotFoundException {
		return movieservice.getMovieByid(id);
	}
	
	@PostMapping("/add")
	public String saveMovie(@RequestBody Movie movie) {
		Movie savedMovie = movieservice.saveMovie(movie);
		ResponseEntity<Movie> res = ResponseEntity.status(HttpStatus.CREATED).build();
		return "Movie added successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) throws MovieNotFoundException{
		boolean deleteMovie = movieservice.deleteMovie(id);
		return "Delete successful: "+deleteMovie;
	}
	
	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleException(HttpServletRequest req, MovieNotFoundException e){
		ErrorMessage error = new ErrorMessage(e.getMessage(), LocalDate.now(), req.getRequestURL(), HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
