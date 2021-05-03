package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.demo.exceptions.InvalidItemException;
import com.demo.models.Item;
import com.demo.util.DB;

@Service
public class ItemService {
	
	public List<Item> getAllItems(){
		
		Set<Integer> keySet = DB.getItemsDb().keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		List<Item> items = new ArrayList<Item>();
		while(iterator.hasNext()) {
			int itemId = iterator.next();
			Item item = DB.getItemsDb().get(itemId);
			items.add(item);
		}
		
		return items;
	}
	public Item getItemByCode(int code) {
		return DB.getItemsDb().get(code);
	}
	public Item saveItem(Item item) throws InvalidItemException {
		
		// verify
		if(item.getName()==null || item.getName().length()==0) {
			throw new InvalidItemException("Item does not have name");
		} else if(item.getPrice()<1) {
			throw new InvalidItemException("Item does not have valid price");
		} else if(item.getCode()<=0) {
			throw new InvalidItemException("Item does not have valid code");			
		} else {
			DB.getItemsDb().put(item.getCode(), item);
			return item;
		}
	}
	public Item updateItem(int code, Item item) {
		DB.getItemsDb().put(code, item);
		return item;
	}
	public boolean deleteItem(int code) {
		Item item = DB.getItemsDb().remove(code);
		return item != null;
	}
	
}
