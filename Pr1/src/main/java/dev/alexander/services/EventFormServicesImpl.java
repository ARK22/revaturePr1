package dev.alexander.services;

import java.util.ArrayList;

import dev.alexander.models.event;
import dev.alexander.repos.EventRepos;
import dev.alexander.repos.EventReposImpl;

public class EventFormServicesImpl implements EventFormServices {

	private EventRepos repo = new EventReposImpl();
	@Override
	public event getEventById(int event_id, int emp_id) {
		// TODO Auto-generated method stub
		return repo.getEventById(event_id, emp_id);
	}

	@Override
	public ArrayList<event> getAllEventsByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEvent(event current_form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEvent(event currentForm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createEventForm(event newEventForm) {
		// TODO Auto-generated method stub
		return false;
	}

}
