package com.abc.team;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fn").trim();
		String lname = request.getParameter("ln").trim();
		String email = request.getParameter("em").trim();
		String pass = request.getParameter("pass");
		
		
		if(fname==null||fname==""||lname==null||lname==""||email==null||email==""||pass==null||pass=="") {
			out.print("<center><h1 style='color:red'>All FIELDS ARE MANDATORY</h1></center>");
			RequestDispatcher dispatcher =request.getRequestDispatcher("/formproject.html");
			dispatcher.include(request, response);
		}
		else {
			String input = GetUser.regis(email);
			if(input==null) {
		Check.input(fname,lname,email,pass);
		out.println("<center><h2>Registration sucessfull</h2></center>");
		out.println("<center><a href='formproject.html'>BACK TO LOGIN PAGE</a></center>");
			}
			else {
				out.println("<center><h2 style='color:red'>User alredy exist!!!</h2></center>");
				RequestDispatcher dispatcher =request.getRequestDispatcher("/formproject.html");
				dispatcher.include(request, response);	
			}
		}
		
	}

}
