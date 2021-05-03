package com.demo.entities;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

public class Book {
	@Id
	private int id;
	private String title;
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}
