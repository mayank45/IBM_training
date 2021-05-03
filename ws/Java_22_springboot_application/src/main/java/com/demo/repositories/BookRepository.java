package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {
	// findById
	// findAll
	// save
	// delete
}
