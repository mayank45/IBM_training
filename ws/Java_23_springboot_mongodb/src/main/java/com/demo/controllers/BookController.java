package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.demo.entities.Book;
import com.demo.services.BookService;

@RestController
@RequestMapping("books")
@CrossOrigin(origins= {"https://hoppscotch.io"} )
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("")
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book findBookById(@PathVariable int id) {
		return bookService.findBookById(id);
	}
	
	@PostMapping("")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/title")
	public List<Book> findBookByTitle(@RequestParam("name") String title) {
		return bookService.findBookByTitle(title);
	}
}
