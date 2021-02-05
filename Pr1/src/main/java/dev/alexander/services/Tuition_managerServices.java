package dev.alexander.services;

import dev.alexander.models.tuition_manager;

public interface Tuition_managerServices {

	public tuition_manager getTuitionByEmpId(int emp_id);
	public boolean updateTuitionByEmpId();
}
