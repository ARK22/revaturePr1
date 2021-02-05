package dev.alexander.services;

import dev.alexander.models.department;
import dev.alexander.repos.DepartmentRepos;
import dev.alexander.repos.DepartmentReposImpl;

public class DepartmentServicesImpl implements DepartmentServices {

	DepartmentRepos serv = new DepartmentReposImpl();
	@Override
	public department getDeptById(int id) {
		// TODO Auto-generated method stub
		return serv.getDeptById(id);
	}

	@Override
	public boolean updateDepartment(department dept) {
		
		return serv.updateDepartment();
	}

}
