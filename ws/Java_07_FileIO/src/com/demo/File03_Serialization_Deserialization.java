package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Item implements Serializable{
	String name;
	double price;
	int code;
	public Item(String name, double price, int code) {
		super();
		this.name = name;
		this.price = price;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", code=" + code + "]";
	}
	
}

public class File03_Serialization_Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Item item = new Item("MyMobile", 9999.9, 65214);
		String filename = "app_filesystem.abc";
		File file = new File(filename);
//		serialize(item, file);
		Item item2 = deserialize(file);
		System.out.println(item2);
		System.out.println(item == item2);
	}

	private static Item deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Item item = (Item)ois.readObject();
		
		System.out.println("reading is done");
		ois.close();
		fis.close();
		return item;
	}

	private static void serialize(Item item, File file) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(item);
		
		oos.close();
		fos.close();
		System.out.println("object is written successfully");
	}
}
