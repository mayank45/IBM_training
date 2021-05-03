package com.demo.model;

public class User {
	private String name;
	private int age;
	private String email;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String email, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
