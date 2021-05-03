package com.demo.util;

import java.util.HashMap;
import java.util.Map;

import com.demo.models.Item;

public class DB {
	
	private static Map<Integer, Item> itemsDb = new HashMap<Integer, Item>();
	
	public static Map<Integer, Item> getItemsDb() {
		return itemsDb;
	}

}
