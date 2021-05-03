package com.demo.model;

public class Order {
	private int id;
	private String status;
	
	public Order(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

