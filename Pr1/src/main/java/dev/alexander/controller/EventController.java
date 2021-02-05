package dev.alexander.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.alexander.models.event;

public class EventController {
	public static Gson gson = new Gson();
	
	public static void getEvent(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	}
	public static void getAllEvents(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	}
	public static void createEvent(HttpServletRequest request, HttpServletResponse response) {
	
		event newForm = new event();
		newForm.setAssociate_id(Integer.valueOf(request.getParameter("emp_id")));
		newForm.setDescription(request.getParameter("description"));
		newForm.setLocation(request.getParameter("location"));
		newForm.setDate(request.getParameter("date"));
		newForm.setCost(Double.valueOf(request.getParameter("cost")));
		newForm.setGrading_type(3);
		newForm.setGrade(request.getParameter("grade"));
		newForm.setEvent_id(1);
		

	}
	public static void getAllTransactionByEmployee(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
