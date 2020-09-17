package com.abc.team;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

@WebServlet("/hs")
public class SearchResult extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PreparedStatement pstmt;
	private ResultSet rst;
	private Connection con;
	private String value;
	private String time;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		List val = historyConnect.input();
		List time = historyConnect.regis();
		
		PrintWriter out = response.getWriter();
		request.setAttribute("text", val);
		request.setAttribute("time", time);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/history.jsp");
		dispatcher.forward(request, response);
		
			
		
	
	
	
	}
		
		
		
	}


