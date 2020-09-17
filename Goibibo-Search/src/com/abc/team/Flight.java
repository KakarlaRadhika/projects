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

@WebServlet("/fl")
public class Flight extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		String from = request.getParameter("from").trim();
		String to = request.getParameter("to").trim();
		String date = request.getParameter("date");
		PrintWriter out = response.getWriter();
		if(((from==null||from.equals(""))&&(to==null||to.equals(""))&&(date==null||date.equals("")))) {
			out.print("<center><h1 style='color:red; margin-top:50px'>SEARCH BOX IS EMPTY!!!</h1></center>");
			RequestDispatcher dispatcher =request.getRequestDispatcher("/search.jsp");
			dispatcher.include(request, response);			
		}
		else {
			String qry = FlightConnect.input(from, to,date);
			response.sendRedirect(qry);
		}		
		
		
	}
}


