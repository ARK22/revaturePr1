 package dev.alexander.controller;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import dev.alexander.models.employee;
import dev.alexander.services.EmployeeServices;
import dev.alexander.services.EmployeeServicesImpl;


public class EmployeeController {
	
	public static Gson gson = new Gson();
	public static EmployeeServices serv = new EmployeeServicesImpl();
	
	public static void getEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		
		String input = request.getParameter("userName");	
		
		if(input == null) 
		{
			System.out.println("Nope");
		}
		employee emp = serv.getEmpByName(input);
	
		if(emp.getPassword().equals(request.getParameter("password"))) 
		{
			response.getWriter().append((emp != null) ? gson.toJson(emp) : "{}");
		}
		else 
		{
			response.getWriter().append((emp != null) ? gson.toJson("{}") : "{}");
		}
		
	}
	

}
