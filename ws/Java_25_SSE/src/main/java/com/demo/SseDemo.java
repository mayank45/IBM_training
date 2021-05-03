package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /sse
public class SseDemo extends HttpServlet {
	
	public void add(int fnum, int snum) {
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/event-stream");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.write("data: " + System.currentTimeMillis() + "\n\n");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in post method");
		doGet(request, response);
	}

}
/*
 * 500 404
 * 
 */
