package com.practice.controllers;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Exception.UserNotFoundException;
import com.practice.entities.User;
import com.practice.services.UserService;
import com.practice.entities.ErrorMessage;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userservice;
	@GetMapping("")
	public List<User> getUsers(){
		return userservice.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) throws UserNotFoundException {
		return userservice.getUserById(id);
	}
	
	@PostMapping("/add")
	public String saveUser(@RequestBody User user) {
		User savedUser = userservice.saveUser(user);
		return "User saved successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) throws UserNotFoundException {
		boolean deleteUser = userservice.deleteUser(id);
		return "Delete successful: "+deleteUser;
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleException(HttpServletRequest req, UserNotFoundException e){
		ErrorMessage error = new ErrorMessage(e.getMessage(), LocalDate.now(), req.getRequestURL(), HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
