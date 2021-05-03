package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Book;
import com.demo.services.BookService;

@RestController
@RequestMapping("books")
@CrossOrigin(origins = {"https://hoppscotch.io"})
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/{id}")
	public Book findBookById(@PathVariable int id) {
		return bookService.findBookById(id);
	}
	@GetMapping("")
	public List<Book> findBooks(){
		return bookService.findBooks();
	}
	
	@PostMapping("")
	public int createBook(@RequestBody Book book) {
		System.out.println(book);
		return bookService.createBook(book);
	}
	
	@PutMapping("/{id}")
	public boolean editBook(@PathVariable int id,@RequestBody Book book) {
		return bookService.editBook(id, book);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return true;
	}
}
