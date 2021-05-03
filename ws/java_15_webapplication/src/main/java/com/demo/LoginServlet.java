package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In get");
		PrintWriter writer = response.getWriter();
		writer.print("some data");
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In post");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		System.out.println("in servlet userid: "+userid);
		System.out.println("in servlet password: "+pwd);
		// find data in database
		
		// service for verification, dao for data communication
		
		PrintWriter writer = response.getWriter();
		if(userid != null && userid.equals(pwd)) {
			System.out.println("valid user");
			writer.print("valid user");
		} else {
			System.out.println("invalid user");
			writer.print("invalid user");
		}
		writer.close();
	}

}
