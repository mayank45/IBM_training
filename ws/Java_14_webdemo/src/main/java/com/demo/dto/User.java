package com.demo.dto;

public class User {
	private String name;
	private String userid;
	private String password;
	private int age;
	private String address;
	
	
	
	
	
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}



	public User(String name, String userid, String password, int age, String address) {
		super();
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.age = age;
		this.address = address;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", userid=" + userid + ", password=" + password + ", age=" + age + ", address="
				+ address + "]";
	}
	
	
}
