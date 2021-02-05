package dev.alexander.repos;

import dev.alexander.models.department;

public interface DepartmentRepos {
	
	public department getDeptById(int id);
	public boolean updateDepartment();

}
