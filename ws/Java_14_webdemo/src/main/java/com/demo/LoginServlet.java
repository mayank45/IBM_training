package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dto.User;
import com.demo.service.LoginService;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in get");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("in post");

		String userid = req.getParameter("userid");
		String password = req.getParameter("pwd");
		
		System.out.println("Userid: "+userid+" and password: "+password);
		User user = new User(userid, password);
		
		LoginService service = new LoginService();
		boolean isValid = service.login(user);
		
		PrintWriter out = res.getWriter();
		if(isValid) {
			System.out.println("valid user");
			out.write("valid user");
		} else {
			System.out.println("invalid user");
			out.write("<p style='color:red'>Invalid user</p>");
		}
		
		out.close();
	}

}
