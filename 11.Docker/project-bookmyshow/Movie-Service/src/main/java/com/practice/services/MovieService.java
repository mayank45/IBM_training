package com.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Exception.MovieNotFoundException;
import com.practice.entities.Movie;
import com.practice.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movierepository;
	
	public List<Movie> getAllMovie(){
		return movierepository.findAll();
	}
	
	public Movie getMovieByid(int id) throws MovieNotFoundException {
		Optional<Movie> optional = movierepository.findById(id);
		Movie movie = optional.orElse(null);
		if(movie!=null)
		{
			return movie;
		}
		else
		{
			throw new MovieNotFoundException("Movie does not exist");
		}
	}
	
	public Movie saveMovie(Movie movie) {
		return movierepository.save(movie);
	}
	
	public boolean deleteMovie(int id) throws MovieNotFoundException {
		Optional<Movie> optional = movierepository.findById(id);
		Movie movie = optional.orElse(null);
		if(movie==null)
		{
			throw new MovieNotFoundException("Movie not found");
		}
		else
		{
			movierepository.deleteById(id);
			return true;
		}
	}
}
