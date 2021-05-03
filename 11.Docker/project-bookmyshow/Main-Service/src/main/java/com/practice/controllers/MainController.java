package com.practice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.practice.entities.Booking;
import com.practice.entities.Movie;
import com.practice.entities.User;

@RestController
@RequestMapping("main")
public class MainController {
	
	
	@Autowired
	RestTemplate resttemplate;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		ResponseEntity<List<User>> response = resttemplate.exchange(
				"http://USERS-SERVICE/users",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<User>>() {});
		
		List<User> users = response.getBody();
		
		return users;
	}
	@GetMapping("/users/{id}") 
	public User getUserbyId(@PathVariable int id) { 
		ResponseEntity<User> response = resttemplate.exchange(
				"http://USERS-SERVICE/users/"+id,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<User>() {});
		
		User user = response.getBody();
		
		return user;
		
	}
	@PostMapping("/users/add")
	public String saveUser(@RequestBody User user) {
		HttpEntity<User> u = new HttpEntity<User>(user);
		ResponseEntity<String> response = resttemplate.exchange(
				"http://USERS-SERVICE/users/add",
				HttpMethod.POST,
				u,
				new ParameterizedTypeReference<String>() {});
		
		String saveres = response.getBody();
		
		return saveres;
	}
	
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		ResponseEntity<String> response = resttemplate.exchange(
				"http://USERS-SERVICE/users/"+id,
				HttpMethod.DELETE,
				null,
				new ParameterizedTypeReference<String>() {});
		
		String delres = response.getBody();
		
		return delres;
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		ResponseEntity<List<Movie>> response = resttemplate.exchange(
				"http://MOVIES-SERVICE/movies",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Movie>>() {});
		
		List<Movie> movies = response.getBody();
		
		return movies;
	}
	
	@GetMapping("/movies/{id}") 
	public Movie getMoviebyId(@PathVariable int id) { 
		ResponseEntity<Movie> response = resttemplate.exchange(
				"http://MOVIES-SERVICE/movies/"+id,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<Movie>() {});
		
		Movie movie = response.getBody();
		
		return movie;
		
	}
	@PostMapping("/movies/add")
	public String saveMovie(@RequestBody Movie movie) {
		HttpEntity<Movie> m = new HttpEntity<Movie>(movie);
		ResponseEntity<String> response = resttemplate.exchange(
				"http://MOVIES-SERVICE/movies/add",
				HttpMethod.POST,
				m,
				new ParameterizedTypeReference<String>() {});
		
		String saveres = response.getBody();
		
		return saveres;
	}
	
	
	@DeleteMapping("/movies/{id}")
	public String deleteMovie(@PathVariable int id) {
		ResponseEntity<String> response = resttemplate.exchange(
				"http://MOVIES-SERVICE/movies/"+id,
				HttpMethod.DELETE,
				null,
				new ParameterizedTypeReference<String>() {});
		
		String delres = response.getBody();
		
		return delres;
	}
	
	@GetMapping("/bookings")
	public List<Booking> getAllBookings() {
		ResponseEntity<List<Booking>> response = resttemplate.exchange(
				"http://BOOKING-SERVICE/bookings",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Booking>>() {});
		
		List<Booking> bookings = response.getBody();
		
		return bookings;
		
	}
	
	@PostMapping("/bookings/add")
	public Booking saveBooking(@RequestBody Booking booking) {
		HttpEntity<Booking> b = new HttpEntity<Booking>(booking);
		ResponseEntity<Booking> response = resttemplate.exchange(
				"http://BOOKING-SERVICE/bookings/newbooking",
				HttpMethod.POST,
				b,
				new ParameterizedTypeReference<Booking>() {});
		
		Booking savebooking = response.getBody();
		
		return savebooking;
	}
}
