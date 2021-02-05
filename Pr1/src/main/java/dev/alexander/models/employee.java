package dev.alexander.models;

public class employee {
	
	private int emp_id;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private String email;
	private int supervisor;
	private int dept_id;
	private boolean logged;
	
	
	
	
	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public employee(int emp_id, String first_name, String last_name, String username, String password, String email,
			int supervisor, int dept_id) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.supervisor = supervisor;
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
				+ username + ", password=" + password + ", email=" + email + ", supervisor=" + supervisor + ", dept_id="
				+ dept_id + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

}
