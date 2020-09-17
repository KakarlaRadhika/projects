package com.abc.team;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class historyConnect {
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rst;

	
	
	
	public static void add(String name ,String date) {
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "insert into history  values (?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 pstmt = con.prepareStatement(qry);
			Scanner scn = new Scanner(System.in);
			
				
			pstmt.setString(1,name);
			pstmt.setString(2,date);
			
			
			pstmt.executeUpdate();
			
		}
		catch(ClassNotFoundException|SQLException e) {e.printStackTrace();}
	
finally {
		try {
			if(pstmt!=null)
				pstmt.close();
			
			if(con!=null)
				con.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
}
	}
	public static List input() {
		String name=null;
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "select name from history";
		List<String> value = new ArrayList<String>();
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 
			 pstmt = con.prepareStatement(qry);
			
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				 value.add(rst.getString(1));
				
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
		return value;
	}
	
	public static List regis() {
		String name=null;
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "select time from history";
		List<String> time = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 
			 pstmt = con.prepareStatement(qry);
			 
			
			 rst = pstmt.executeQuery();
			 while(rst.next()) {
				 time.add(rst.getString(1));
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
		return time;
	}
	}
	
