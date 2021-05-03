package com.demo;

import java.util.HashMap;
import java.util.Map;

class User{
	String email;
	String password;
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
}
class DummyDatabase{
	static Map<String, User> db = new HashMap<String, User>();
}

class Application{
	static boolean login(User user){
//		System.out.println(DummyDatabase.db);
		User dbUser = DummyDatabase.db.get(user.email);
		if(dbUser == null) {
			return false;
		}
		return dbUser.password.equals(user.password);
	}
	static void register(User user){
		if(user.email!=null) {
			DummyDatabase.db.put(user.email, user);
			System.out.println("user is saved");
			System.out.println("After saving: ");
			System.out.println(DummyDatabase.db);
		} else {
			System.out.println("User is not saved");
			System.out.println(DummyDatabase.db);
		}
	}
}

public class TestApplication {

	public static void main(String[] args) {
		User user1 = new User("arun@gmail.com", "admin");
		User user2 = new User("admin@gmail.com", "admin@123");
		User user3 = new User("mark@gmail.com", "demo");
		Application.register(user1);
		Application.register(user2);
		Application.register(user3);
		
		User user4 = new User("admin@gmail.com", "admin@123");
		System.out.println(Application.login(user4));
	}
}
