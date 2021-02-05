package dev.alexander.services;

import java.util.ArrayList;

import dev.alexander.models.transactions;

public interface TransactionServices {
	
	ArrayList<transactions> getAllTransByEmpId(int emp_id);

	
	
}
