package com.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dto.User;
import com.demo.service.LoginService;


public class LoginServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("in post");

		String userid = req.getParameter("userid");
		String password = req.getParameter("pwd");
		
		System.out.println("Userid: "+userid+" and password: "+password);
		User user = new User(userid, password);
		
		LoginService service = new LoginService();
		boolean isValid = service.login(user);
		
		if(isValid) {
			System.out.println("valid user");
			res.sendRedirect("user/welcome.jsp");
		} else {
			System.out.println("invalid user");
			res.sendRedirect("login.jsp");
		}
		
		}

}
