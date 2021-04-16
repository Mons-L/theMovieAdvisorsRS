package event.management.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import event.management.web.data.Artist;
import event.management.web.data.Event;

/**
 * EventService est la classe du service d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
public class EventService {

	public static HashMap<Integer, Event> EVENT_DATA = new HashMap<Integer, Event>();
	
	/**
	 * Méthode permettant de récupérer le nouvel identifient.
	 *  
	 * @return Retourne le nouvel identifiant.
	 *
	 */
	private int getNewId() {
		int newId = 0;
		for(int id : EVENT_DATA.keySet()) {
			if(newId < id)
				newId = id;
		}
		return ++newId;
	}
	
	/**
	 * Méthode permettant d'ajouter un évènement.
	 *  
	 * @param event
	 * @return L'évènement ajouté ou null en cas d'erreur.
	 *
	 */
	public Event addEvent(Event event) {
		int eventId = getNewId();
		if(!EVENT_DATA.containsKey(eventId)) {
			event.setId(eventId);
			EVENT_DATA.put(eventId, event);
			return event;
		}
		return null;
	}

	/**
	 * Méthode permettant de récupérer les évènements à partir d'une région.
	 *  
	 * @param area
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	public Event[] getEventsByArea(String area) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : EVENT_DATA.values()){
			if(event.getArea().equals(area))
				events.add(event);
		}
		
		return events.toArray(new Event[events.size()]);
	}
	
	/**
	 * Méthode permettant de récupérer les évènements à partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	public Event[] getEventsByArtist(int id, Artist artist) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : EVENT_DATA.values()){
			if(event.getArtist().getId() == id)
				events.add(event);
		}
		return events.toArray(new Event[events.size()]);
	}

	/**
	 * Méthode permettant de récupérer tout les évènements.
	 *  
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	public Event[] getAllEvents() {
		return EVENT_DATA.values().toArray(new Event[EVENT_DATA.values().size()]);
	}
}
