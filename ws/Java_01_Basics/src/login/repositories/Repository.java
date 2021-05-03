package login.repositories;

public class Repository {

	public boolean login(String username, String password) {
		System.out.println("in repo");
		return username.equals(password);
	}

}
