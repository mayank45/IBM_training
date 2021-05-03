package com.practice.entities;

import org.springframework.data.annotation.Id;

public class Booking {
	@Id
	int id;
	
	int userid;
	int movieid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", userid=" + userid + ", movieid=" + movieid + "]";
	}
}
