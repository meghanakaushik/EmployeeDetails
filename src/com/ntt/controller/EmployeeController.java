package com.ntt.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ntt.dao.EmployeeDao;
import com.ntt.request.EmployeeRequest;

@Controller

public class EmployeeController {

	@RequestMapping("/")
	public String Employee() {
		return "home";
	}

	
	@RequestMapping("/register")
	public String EmployeeRegister() {
		return "register";
	}

	@RequestMapping("/registerpage")
	public String EmployeeRegister1(@Validated EmployeeRequest emprequesrt ,Model model) throws SQLException {
		
	
	/*	EmployeeRequest emprequesrt = new EmployeeRequest();*/
		
		int empId=emprequesrt.getEmployeeID();
		System.out.println("id is "+empId);
		String empname=emprequesrt.getEmployeeName();
		String empaddress=emprequesrt.getEmployeeAddress();
		model.addAttribute("EmployeeID", empId);
		model.addAttribute("Employeename", empname);
		model.addAttribute("Employeeaddress", empaddress);
		EmployeeDao empdao = new EmployeeDao();
		
	boolean result=empdao.register(empId, empname, empaddress);
	if(result==true)
		return "hello";
	else
		return "failure";
	}

}

