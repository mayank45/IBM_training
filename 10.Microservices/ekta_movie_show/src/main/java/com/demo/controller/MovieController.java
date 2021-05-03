package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;

	@PostMapping()
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}

	@GetMapping("")
	public List<Movie> findAllMovies() {
		return movieService.findAllMovies();
	}

	// http://localhost:9595/movies/by?release=&rating=&title=
	@GetMapping("/by")
	public List<Movie> findMoviebyTitle(@RequestParam String title, @RequestParam String rating) {
		System.out.println("Title: "+title);
		System.out.println("Rating: "+rating);

		// if(title != null && rating == null){
		// 	findByTitle
		// } else if(title == null && rating != null){
		// 	findByRating
		// } else if(title == null && rating == null){
		// 	return null
		// } else {
		// 	findByTitle where rating
		// }

		return movieService.findMoviebyTitle(title);
	}

	// http://localhost:9595/movies/-
	@GetMapping("/{id}")
	public Movie findMoviebyId(@PathVariable int id) {
		return movieService.findMoviebyId(id);
	}

}








