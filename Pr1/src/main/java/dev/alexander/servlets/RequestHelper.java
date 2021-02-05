package dev.alexander.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.alexander.controller.EmployeeController;
import dev.alexander.controller.EventController;
import dev.alexander.controller.TransactionController;
import dev.alexander.controller.Tuition_ManagerController;

public class RequestHelper {
	
	/**
	 * This method will delegate other methods on the controller
	 * layer of our application to process the request.
	 * @param request the HTTP Request
	 * @param response the HTTP Response
	 * @throws IOException 
	 */
	public static void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		switch (uri) {
		
		case "/Pr1/login.do": {
			EmployeeController.getEmployee(request, response);
			break;
		}
		case"/Pr1/records.do":
		{
			EventController.getEvent(request,response);
			break;
		}
		case"/Pr1/newform.do":
		{  EventController.createEvent(request,response);
			break;
		}
		case"/Pr1/transactions.do":
		{
			TransactionController.getAllTransactionByEmployee(request,response);
			break;
		}
		case"/Pr1/pending.do":
		{
			break;
		}
		case"/Pr1/approved.do":
		{
			break;
		}
		case"/Pr1/balance.do":
		{
			Tuition_ManagerController.getBalance(request,response);
			break;
		}
		case"/Pr1/review.do":
		{
			break;
		}
		case "/Pr1/Dashobard.do": { 
			
			break;
		}
		
		default: {
			response.sendError(418, "Default case hit. Cannot brew coffee, is teapot.");
			break;
		}
		}
		
	}

}
