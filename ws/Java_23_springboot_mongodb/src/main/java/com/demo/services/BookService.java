package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Book;
import com.demo.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public Book findBookById(int id) {
		Optional<Book> optional = bookRepository.findById(id);
		Book book = optional.orElse(null);
		return book;
	}

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> findBookByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

}
