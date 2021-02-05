package dev.alexander.services;

import dev.alexander.models.tuition_manager;
import dev.alexander.repos.Tuition_managerRepos;
import dev.alexander.repos.Tuition_managerReposImple;

public class Tuition_managerServicesImpl implements Tuition_managerServices {
	
	public Tuition_managerRepos repo = new Tuition_managerReposImple();
	
	@Override
	public tuition_manager getTuitionByEmpId(int emp_id) {
		// TODO Auto-generated method stub

		System.out.println("Balancer2");
		return repo.getTuitionByEmpId(emp_id);
	}

	@Override
	public boolean updateTuitionByEmpId() {
		// TODO Auto-generated method stub
		return false;
	}

}
