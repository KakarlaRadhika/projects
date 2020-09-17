package com.abc.team;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightConnect {
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rst;
	private static String sourcecnt;
	private static String dest;
	private static String destcnt;
	private static String out;

	public static String input(String from,String to,String date) {
		String source=null;
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "select code,country from airports where city=?";
		String qry1 = "select code,country from airports where city=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 
			 
			 String[] split = date.split("-");
			 String da="";
			 for (String string : split) {
				da+=string;
			}
			 
			 pstmt = con.prepareStatement(qry);
			 pstmt.setString(1, from);
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				 source=rst.getString(1);
				 sourcecnt=rst.getString(2);
			 }
			 
			 
			 pstmt = con.prepareStatement(qry);
			 pstmt.setString(1, to);
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				  dest = rst.getString(1);
				 destcnt=rst.getString(2);
			 }
			 
			 if(sourcecnt.equalsIgnoreCase(destcnt)) {
				 out="https://www.goibibo.com/flights/air-"+source+"-"+dest+"-"+da+"--1-0-0-E-D/";
			 }
			 else {
				 out="https://www.goibibo.com/flights/air-"+source+"-"+dest+"-"+da+"--1-0-0-E-I/";
			 }
			
			
		}
		catch(ClassNotFoundException|SQLException e) {e.printStackTrace();}
	
finally {
		try {
			if(rst != null) {
				rst.close();
			}
			if(pstmt!=null)
				pstmt.close();
			
			if(con!=null)
				con.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
}
		return out;
	}
	
}