package dev.alexander.models;

public class tuition_manager {
	private int manager_id;
	private double remainder;
	private int owner_id;
	
	public tuition_manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public tuition_manager(int manager_id, double remainder, int owner_id) {
		super();
		this.manager_id = manager_id;
		this.remainder = remainder;
		this.owner_id = owner_id;
	}


	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public double getRemainder() {
		return remainder;
	}
	public void setRemainder(double remainder) {
		this.remainder = remainder;
	}
	
}
