package dev.alexander.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.alexander.models.employee;
import dev.alexander.services.DepartmentServices;
import dev.alexander.services.DepartmentServicesImpl;
import dev.alexander.services.EmployeeServices;
import dev.alexander.services.EmployeeServicesImpl;

public class DepartmentController {
	
	public static Gson gson = new Gson();
	public static DepartmentServices serv = new DepartmentServicesImpl();
	
	public static void getDepartment(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		
		String input = request.getParameter("userName");	
		System.out.println(input);
		
		if(input == null) 
		{
			System.out.println("Nope");
		}
		//employee emp = serv.getEmpByName(input);
	
		/*if(emp.getPassword().equals(request.getParameter("password"))) 
		{
			response.getWriter().append((emp != null) ? gson.toJson(emp) : "{}");
		}
		else 
		{
			response.getWriter().append((emp != null) ? gson.toJson("{}") : "{}");
		}*/
		
	}
	
	
	public static void grabDeptHead() 
	{
		
	}
	
	public static void getAllEmpByDeptId() 
	{
		
	}

}
