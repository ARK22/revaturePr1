package dev.alexander.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.alexander.models.transactions;
import dev.alexander.services.TransactionServices;
import dev.alexander.services.TransactionServicesImpl;

public class TransactionController {
	
	TransactionServices service = new TransactionServicesImpl();
	
	public static void getAllTransactionByEmployee(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<transactions> records = new ArrayList<transactions>();

		
		
	}

}
