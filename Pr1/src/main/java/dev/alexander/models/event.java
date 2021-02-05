package dev.alexander.models;

public class event {
	
	private int event_id;
	private String date;
	private String time;
	private int type_id;
	private String location;
	private String mail;
	private String min_grade;
	private String description;
	private double cost;
	private int associate_id;
	private int benco_approval;
	private int super_approval;
	private int grading_type;
	private String grade;

	
	public String getGrade() {
		return grade;
	}




	public event(int event_id, String date, String time, int type_id, String location, String mail, String min_grade,
			String description, double cost, int associate_id, int benco_approval, int super_approval, int grading_type,
			String grade) {
		super();
		this.event_id = event_id;
		this.date = date;
		this.time = time;
		this.type_id = type_id;
		this.location = location;
		this.mail = mail;
		this.min_grade = min_grade;
		this.description = description;
		this.cost = cost;
		this.associate_id = associate_id;
		this.benco_approval = benco_approval;
		this.super_approval = super_approval;
		this.grading_type = grading_type;
		this.grade = grade;
	}




	public void setGrade(String grade) {
		this.grade = grade;
	}




	public int getGrading_type() {
		return grading_type;
	}




	public void setGrading_type(int grading_type) {
		this.grading_type = grading_type;
	}




	public event() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getEvent_id() {
		return event_id;
	}


	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getType_id() {
		return type_id;
	}


	public void setType_id(int type_id) {
		this.type_id = type_id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMin_grade() {
		return min_grade;
	}


	public void setMin_grade(String min_grade) {
		this.min_grade = min_grade;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public int getAssociate_id() {
		return associate_id;
	}


	public void setAssociate_id(int associate_id) {
		this.associate_id = associate_id;
	}


	public int getBenco_approval() {
		return benco_approval;
	}


	public void setBenco_approval(int benco_approval) {
		this.benco_approval = benco_approval;
	}


	public int getSuper_approval() {
		return super_approval;
	}


	public void setSuper_approval(int super_approval) {
		this.super_approval = super_approval;
	}


	@Override
	public String toString() {
		return "event [event_id=" + event_id + ", date=" + date + ", time=" + time + ", type_id=" + type_id
				+ ", location=" + location + ", mail=" + mail + ", min_grade=" + min_grade + ", description="
				+ description + ", cost=" + cost + ", associate_id=" + associate_id + ", benco_approval="
				+ benco_approval + ", super_approval=" + super_approval + "]";
	}

	

}
