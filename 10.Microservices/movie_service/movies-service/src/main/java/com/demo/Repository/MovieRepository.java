package com.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import com.demo.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer>{
    List<Movie> findByTitle(String title);
}
