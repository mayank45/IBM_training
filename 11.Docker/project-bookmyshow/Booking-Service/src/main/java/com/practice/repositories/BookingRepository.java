package com.practice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.entities.Booking;

public interface BookingRepository extends MongoRepository<Booking, Integer>{

}
