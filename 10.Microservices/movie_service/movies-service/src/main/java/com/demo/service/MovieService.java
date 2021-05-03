package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.MovieRepository;
import com.demo.entities.Movie;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
		
	}

//	public ArrayList<Movie> findAllMovies() {
//		List<Movie> movies = movieRepository.findAll();
//		return (ArrayList<Movie>) movies;
//	}

	public List<Movie> findMoviebyTitle(String title) {
		return movieRepository.findByTitle(title);
	}

	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

    public Movie findMoviebyId(int id) {
		Optional<Movie> optional = movieRepository.findById(id);
		Movie movie = optional.orElse(null);
        return movie;
    }

	

}
