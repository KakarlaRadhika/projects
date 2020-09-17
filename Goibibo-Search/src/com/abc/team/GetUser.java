package com.abc.team;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetUser {
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rst;

	public static String input(String email,String pass) {
		String name=null;
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "select First_name from userdata where Email=? and pass=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 
			 pstmt = con.prepareStatement(qry);
			 pstmt.setString(1, email);
			 pstmt.setString(2, pass);
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				 name=rst.getString(1);
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
		return name;
	}
	
	public static String regis(String email) {
		String name=null;
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "select First_name from userdata where Email=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 
			 pstmt = con.prepareStatement(qry);
			 pstmt.setString(1, email);
			
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				 name=rst.getString(1);
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
		return name;
	}
	
	
}
