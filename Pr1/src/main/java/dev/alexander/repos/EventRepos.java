package dev.alexander.repos;

import java.util.ArrayList;

import dev.alexander.models.event;

public interface EventRepos {
	
	event getEventById(int event_id,int emp_id);
	ArrayList<event> getAllEventsByDept();
	boolean updateEvent(event current_form);
	boolean deleteEvent(event currentForm);
	boolean createEventForm(event newEventForm);
	public ArrayList<event> getAllEventsByEmp_Id(int emp_id);
	

}
