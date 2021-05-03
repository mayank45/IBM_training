package com.practice.controllers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.practice.Exceptions.InvalidEntryException;
import com.practice.entities.Booking;
import com.practice.entities.ErrorMessage;
import com.practice.services.BookingService;

@RestController
@RequestMapping("bookings")
public class BookingController {
	
	@Autowired
	RestTemplate resttemplate;
	
	@Autowired
	BookingService bookingservice;
	
	@GetMapping("")
	public List<Booking> getAllBookings(){
		return bookingservice.getAllBookings();
	}
	
	@PostMapping("newbooking")
	public Booking newBooking(@RequestBody Booking booking) throws InvalidEntryException {
		
		int userid = booking.getUserid();
		System.out.println(userid);
		int movieid = booking.getMovieid();
		System.out.println(movieid);

		ResponseEntity<Object> response1 = resttemplate.exchange(
				"http://USERS-SERVICE/users/"+userid,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<Object>() {});
		HashMap users = (HashMap) response1.getBody();
		System.out.println(users);
		
		ResponseEntity<Object> response2 = resttemplate.exchange(
				"http://MOVIES-SERVICE/movies/"+movieid,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<Object>() {});
		HashMap movies = (HashMap) response2.getBody();
		System.out.println(movies);
		int i = (int) (users.get("id"));
		int m = (int) (movies.get("id"));
		if(i==(userid)&&m==(movieid))
		{
			return bookingservice.saveBooking(booking);
		}
		else
		{
			throw new InvalidEntryException("Entered User id or Movie id does not exist");
		}
	}
	
	@ExceptionHandler(InvalidEntryException.class)
	public ResponseEntity<ErrorMessage> handleException(HttpServletRequest req, InvalidEntryException e){
		ErrorMessage error = new ErrorMessage(e.getMessage(), LocalDate.now(), req.getRequestURL(), HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
