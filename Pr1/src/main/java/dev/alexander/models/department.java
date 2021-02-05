package dev.alexander.models;

public class department {
	
	
	private int dept_id;
	private int head_id;
	private String dept_name;
	
	
	
	public department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public department(int dept_id, int head_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.head_id = head_id;
		this.dept_name = dept_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getHead_id() {
		return head_id;
	}
	public void setHead_id(int head_id) {
		this.head_id = head_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
}
