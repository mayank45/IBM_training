package com.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entities.Booking;
import com.practice.repositories.BookingRepository;

@Service
public class BookingService {
	
	@Autowired 
	BookingRepository bookingrepository;
	
	public List<Booking> getAllBookings(){
		return bookingrepository.findAll();
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingrepository.save(booking);
	}
}
