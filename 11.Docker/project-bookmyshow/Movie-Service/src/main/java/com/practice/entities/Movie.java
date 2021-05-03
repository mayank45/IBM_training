package com.practice.entities;

import org.springframework.data.annotation.Id;

public class Movie {
	@Id
	int id;
	
	String title;
	String director;
	double rating;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Movie(int id, String title, String director, double rating) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
}
