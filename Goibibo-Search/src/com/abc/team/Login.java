package com.abc.team;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email = request.getParameter("em1").trim();
		String pass = request.getParameter("pwd1");
		PrintWriter out = response.getWriter();
		if(email==null||email==""||pass==null||pass=="") {
			out.print("<center><h1 style='color:red; margin-top:50px'>All FIELDS ARE MANDATORY!!!</h1></center>");
			RequestDispatcher dispatcher =request.getRequestDispatcher("/formproject.html");
			dispatcher.include(request, response);			
		}
		else {
			String fname = GetUser.input(email,pass);
			if(fname==null) {
				out.println("<center><h2 style='color:red'>INVALID USER!!!</h2></center>");
				RequestDispatcher dispatcher =request.getRequestDispatcher("/formproject.html");
				dispatcher.include(request, response);		
				
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("myEmail", email);
				session.setAttribute("myPass", pass);
				request.setAttribute("name", fname);
				out.println("<center><h1>WELCOME "+fname+"</h1><center>");
				response.sendRedirect("search.jsp");
			}
			}
			}
		}


