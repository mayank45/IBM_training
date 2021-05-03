package login.services;

import login.repositories.Repository;

public class Service {

	public boolean login(String username, String password) {
		System.out.println("in service");
		if(username.length() > 0 && password.length() > 0) {
			Repository repository = new Repository();
			return repository.login(username, password);
		} else {
			return false;
		}
	}
	
}
