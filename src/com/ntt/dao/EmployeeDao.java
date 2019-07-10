package com.ntt.dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.ntt.util.DBconnection;

public class EmployeeDao {

	public boolean register(int empId, String empname, String empaddress) throws SQLException {
		Connection con=DBconnection.getConnection();
		 Statement stmt = null;
 
	
		  
		        stmt = con.createStatement();
		        int rs = stmt.executeUpdate("insert into Details  values ('"+empId+"','"+empname+"','"+empaddress+"')");

		      
		        if(rs>0)	{
		    		return true;
		    	}
		    	else 
		    		return false;
		    
		    
		
		
		
		
	}

}
	


