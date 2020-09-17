package com.abc.team	;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Check {
	private static Connection con;
	private static PreparedStatement pstmt;

	public static void input(String ... ar) {
		String url = "jdbc:mysql://localhost:3306/studentdemo";
		String user = "root";
		String pwd = "root123";
		String qry = "insert into userdata (First_name,Last_name,Email,pass ) values (?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("conne");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 pstmt = con.prepareStatement(qry);
			Scanner scn = new Scanner(System.in);
			for(int i=1 ;i<=ar.length;i++) {
				
			pstmt.setString(i, ar[i-1]);
			
			}
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
}