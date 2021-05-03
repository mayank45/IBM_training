package com.demo.entities;

import org.springframework.data.annotation.Id;

public class Movie {

	@Id
	int id;

	String title;
	String release_date;
	int rating;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease_date() {
		return this.release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "{" +
			" title='" + getTitle() + "'" +
			", release_date='" + getRelease_date() + "'" +
			", id='" + getId() + "'" +
			", rating='" + getRating() + "'" +
			"}";
	}
	
	
}
