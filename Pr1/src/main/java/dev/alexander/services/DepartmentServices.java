package dev.alexander.services;

import dev.alexander.models.department;

public interface DepartmentServices {
	
	public department getDeptById(int id);
	public boolean updateDepartment(department dept);


}
