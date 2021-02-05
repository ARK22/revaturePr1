package dev.alexander.repos;

import java.util.ArrayList;

import dev.alexander.models.employee;

public interface EmployeeRepos {
	
	public employee  getEmployeeById(int id);
	public employee  getEmployeeByUsername(String username);
	public ArrayList<employee> getAllEmployees();
	public boolean updateEmployee(employee emp);
	public ArrayList<employee> getAllEmployeesByDept(int dept_num);



}
