package dev.alexander.services;

import dev.alexander.models.employee;
import dev.alexander.repos.EmployeeRepos;
import dev.alexander.repos.EmployeeReposImpl;

public class EmployeeServicesImpl implements EmployeeServices {
	
	private EmployeeRepos accessor = new EmployeeReposImpl();
	
	@Override
	public employee getEmpByName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return accessor.getEmployeeByUsername(name);
	}

	@Override
	public employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return accessor.getEmployeeById(id);
	}

	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmp(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public employee login(employee emp) {
		employee temp = accessor.getEmployeeByUsername(emp.getUsername());
		if(temp.getPassword().equals(emp.getPassword()))
		{
			return temp;
		}
		
		return null;
	}

}
