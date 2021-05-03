package com.demo3;


// to generate setters and getters
// right click -> source -> generate setters and getters -> select

class User{
	
	private String name;
	private int age;
	private String password;
	private String email;
	
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
		if(age > 15) {
			this.age = age;
		} else {
			System.out.println("Invalid age. Age must be more than 15");
		}
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("in finalize method");
		
		// clean up
		// close db connection
		// close file
		// close printer
		// connection
	}
	
	
}

public class BeanDemo {
	public static void main(String[] args) {
		User user = new User();
//		User user = new User("demo@gmail.com", "abc@123");
//		user.age = -33; // hide age from outer world
		user.setAge(44);
//		user.getPassword();
		
		System.gc();
	}
}
