package com.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Exception.UserNotFoundException;
import com.practice.entities.User;
import com.practice.repositories.UserRepository;
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(int id) throws UserNotFoundException {
		Optional<User> optional = userRepository.findById(id);
		User user = optional.orElse(null);
		if(user==null)
		{
			throw new UserNotFoundException("User does not exist");
		}
		else
		{
			return user;
		}
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public boolean deleteUser(int id) throws UserNotFoundException {
		Optional<User> optional = userRepository.findById(id);
		User user = optional.orElse(null);
		if(user==null)
		{
			throw new UserNotFoundException("User does not exist");
		}
		else
		{
			userRepository.delete(user);
			return true;
		}
	}
}
