package uk.ac.belfastmet.belfasteventsapi.domain;

import java.util.ArrayList;

public class AllEvents {

	ArrayList <Event> AllEvents = new ArrayList<Event>();

	public AllEvents() {
		super();
	}

	public AllEvents(ArrayList<Event> allEvents) {
		super();
		AllEvents = allEvents;
	}

	public ArrayList<Event> getAllEvents() {
		return AllEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents) {
		AllEvents = allEvents;
	}


}
