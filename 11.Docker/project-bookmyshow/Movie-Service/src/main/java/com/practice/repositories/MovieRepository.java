package com.practice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer> {

}
