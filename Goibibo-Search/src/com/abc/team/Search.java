package com.abc.team;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/se")
public class Search extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String input = request.getParameter("qry").trim();
		String pass = request.getParameter("option");
		
		
		
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		historyConnect.add(input,strDate);
		
		PrintWriter out = response.getWriter();
		if(input==null||input.equals("")) {
			out.print("<center><h1 style='color:red; margin-top:50px'>SEARCH BOX IS EMPTY!!!</h1></center>");
			RequestDispatcher dispatcher =request.getRequestDispatcher("/search.jsp");
			dispatcher.include(request, response);			
		}
		else if(pass.equalsIgnoreCase("video")) {
//			Cookie thecookie =new Cookie("arch");
//			thecookie.setMaxAge(60*60*24*10);
//			response.addCookie(thecookie);
			response.sendRedirect("https://www.youtube.com/results?search_query="+input);
		
			}
		else if(pass.equalsIgnoreCase("music")) {
			response.sendRedirect("https://gaana.com/search/"+input);
		
			}
		else if(pass.equalsIgnoreCase("books")) {
			response.sendRedirect("https://openlibrary.org/search?q="+input+"&mode=ebooks&m=edit&m=edit&has_fulltext=true");
		
			}
		else if(pass.equalsIgnoreCase("movies")) {
			response.sendRedirect("https://openloadmovies.ac/?s="+input);
		
			}
			
		}
		
		
		
	}


