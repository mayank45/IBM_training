package com.demo.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.exceptions.InvalidItemException;
import com.demo.models.ErrorMessage;
import com.demo.models.Item;
import com.demo.service.ItemService;

@RestController
@RequestMapping("items")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@GetMapping("")
	public List<Item> getItems() {
		System.out.println("in get mapping");
		return itemService.getAllItems();
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<Item> getItem(@PathVariable int code) {
		Item item = itemService.getItemByCode(code);
		ResponseEntity<Item> res;
		if(item != null) {
			res = new ResponseEntity<Item>(item, HttpStatus.OK);
		} else {
			res = new ResponseEntity<Item>(HttpStatus.NO_CONTENT);
		}
		return res;
	}
	
	@PostMapping("")
	public ResponseEntity<Item> saveItem(@RequestBody Item item) throws InvalidItemException {
		System.out.println("in post mapping");
		System.out.println(item);
		Item savedItem = itemService.saveItem(item);
//		ResponseEntity<Item> res = ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
		ResponseEntity<Item> res = ResponseEntity.status(HttpStatus.CREATED).build();
		return res;
	}
	
	@PutMapping("/{code}")
	public Item updateItem(@RequestBody Item item, @PathVariable int code) {
		System.out.println("in put mapping");
		System.out.println(item);
		System.out.println(code);
		return itemService.updateItem(code, item);
	}
	
	@DeleteMapping("/{code}")
	public Boolean delteItem(@PathVariable int code) {
		System.out.println("in delete mapping");
		return itemService.deleteItem(code);	
	}
	
	@ExceptionHandler(InvalidItemException.class)
	public ResponseEntity<ErrorMessage> handleException(HttpServletRequest req, InvalidItemException e){
		ErrorMessage error = new ErrorMessage(e.getMessage(), LocalDate.now(), req.getRequestURL(), HttpStatus.BAD_REQUEST);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
	
}
