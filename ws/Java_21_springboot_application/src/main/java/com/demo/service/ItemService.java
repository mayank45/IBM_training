package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.exceptions.InvalidItemException;
import com.demo.models.Item;

@Service
public class ItemService {
	
	public List<Item> getAllItems(){
		// find data from database, repository
		return null;
	}
	public Item getItemByCode(int code) {
		return null;
	}
	public Item saveItem(Item item) throws InvalidItemException {
			return null;
	}
	public Item updateItem(int code, Item item) {
		return null;
	}
	public boolean deleteItem(int code) {
		return false;
	}
	
}
