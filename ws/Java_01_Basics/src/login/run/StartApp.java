package login.run;

import login.services.Service;

public class StartApp {
	public static void main(String[] args) {
		if(args.length < 2 ) {
			System.out.println("Provide username and password");
		} else {
			String username = args[0];
			String password = args[1];
			
			Service service = new Service();
			boolean isLoggedIn = service.login(username, password);
			System.out.println(isLoggedIn);
			
		}
	}
}
