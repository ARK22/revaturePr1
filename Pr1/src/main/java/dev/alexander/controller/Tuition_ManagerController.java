package dev.alexander.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.alexander.models.tuition_manager;
import dev.alexander.services.Tuition_managerServices;
import dev.alexander.services.Tuition_managerServicesImpl;

public class Tuition_ManagerController {
	public static Gson gson = new Gson();
	public static Tuition_managerServices serv = new Tuition_managerServicesImpl();

	public static void getBalance(HttpServletRequest request, HttpServletResponse response)throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("Balancer1");
		 int emp_id = Integer.valueOf(request.getParameter("emp_id"));
		tuition_manager emp_acct =serv.getTuitionByEmpId(emp_id) ;
		
			response.getWriter().append(gson.toJson(emp_acct));
		
	}

}
