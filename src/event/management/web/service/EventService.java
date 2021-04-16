package event.management.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import event.management.web.data.Artist;
import event.management.web.data.Event;

public class EventService {

	public static HashMap<Integer, Event> EVENT_DATA = new HashMap<Integer, Event>();
	
	private int getNewId() {
		int newId = 0;
		for(int id : EVENT_DATA.keySet()) {
			if(newId < id)
				newId = id;
		}
		return ++newId;
	}
	
	public Event addEvent(Event event) {
		int eventId = getNewId();
		if(!EVENT_DATA.containsKey(eventId)) {
			event.setId(eventId);
			EVENT_DATA.put(eventId, event);
			return event;
		}
		return null;
	}

	/*public boolean deleteEvent(int id) {
		boolean removed = false ;
		if(EVENT_DATA.containsKey(id)) {
			Event event = EVENT_DATA.get(id);
			removed = EVENT_DATA.remove(id, event);
		}
		return removed;
	}*/

	public Event[] getEventsByArea(String area) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : EVENT_DATA.values()){
			if(event.getArea().equals(area))
				events.add(event);
		}
		
		return events.toArray(new Event[events.size()]);
	}

	public Event[] getEventsByArtist(int id, Artist artist) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : EVENT_DATA.values()){
			if(event.getArtist().getId() == id)
				events.add(event);
		}
		return events.toArray(new Event[events.size()]);
	}

	public Event[] getAllEvents() {
		return (Event[])EVENT_DATA.values().toArray();
	}
}
