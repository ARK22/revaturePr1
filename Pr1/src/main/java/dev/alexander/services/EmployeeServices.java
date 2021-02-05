package dev.alexander.services;

import dev.alexander.models.employee;

public interface EmployeeServices {

	public employee getEmpByName(String name);
	
	public employee getEmpById(int id);
	
	public boolean deleteEmp(int id);
	
	public boolean updateEmp(int id);
	public employee login(employee emp); 


}
