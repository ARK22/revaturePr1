package dev.alexander.services;

import java.util.ArrayList;

import dev.alexander.models.event;

public interface EventFormServices {
	
	event getEventById(int event_id, int emp_id);
	ArrayList<event> getAllEventsByDept();
	boolean updateEvent(event current_form);
	boolean deleteEvent(event currentForm);
	boolean createEventForm(event newEventForm);

	
}
