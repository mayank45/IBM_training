package com.demo01;

class Controller {
	Service service = new Service();

	public boolean login(String name, String pwd) throws Exception {
		// to delegate task
		return service.login(name, pwd);
	}

}

// business logic
class Service {
	DAO dao = new DAO();

	public boolean login(String name, String pwd) throws Exception {
		// to validate
		if (name.length() > 0 && pwd.length() > 0) {
			return dao.login(name, pwd);
		} else {
//			throw new Exception("Either name is empty or password is empty");
			throw new Demo06_InvalidException();
		}
	}

}

class DAO {
	public boolean login(String name, String pwd) throws Exception {
		// to find data in database
		if (name.equals(pwd)) {
			return true;
		} else {
			throw new Exception("Username and password are not same"); // raise
		}
	}

}

// login
public class Demo06_ThrowVsThrows {
	public static void main(String[] args) {
		Controller controller = new Controller();
		try {
			boolean isValid = controller.login("", "admin");
			if (isValid) {
				System.out.println("User is valid");
			} else {
				System.out.println("User is invalid");
			}
		} catch (NullPointerException e) {
			System.out.println("Either name is null or password is null");
		}catch (Demo06_InvalidException e) {
			System.out.println("Invalid user");
		}
		catch (Exception e) {
			System.out.println("catch block catching Exception");
			System.out.println(e.getMessage());
		}
	}
}
