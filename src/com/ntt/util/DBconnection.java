package com.ntt.util;

import java.sql.*;


public class DBconnection {

	public static Connection con=null;
	public static Connection getConnection() {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=(Connection) DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/EmployeeDetails","root","Nttdata@123");  
		}
		catch(Exception e){
			System.out.println(e);
			}  
		return con;
			}  
	
	
	void closeConnection(Connection con) throws SQLException {
		
		con.close(); 
	}
}