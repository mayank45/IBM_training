package com.practice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.entities.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
