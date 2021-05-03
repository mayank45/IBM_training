package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// localhost:8080/context/home -> get ->doGet, post -> doPost
public class HomePageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in get");
		PrintWriter writer = response.getWriter();
		writer.print("<h1 style='border:2px solid red;color: bule'>This is home page</h1>");
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in post");
		
		PrintWriter writer = response.getWriter();
		writer.print("post response");
		writer.close();

	}

}
