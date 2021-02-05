package dev.alexander.repos;

import dev.alexander.models.tuition_manager;

public interface Tuition_managerRepos {
	public tuition_manager getTuitionByEmpId(int emp_id);
	public boolean updateTuitionByEmpId();

}
