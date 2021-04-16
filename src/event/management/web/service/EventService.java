package event.management.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import event.management.web.data.Artist;
import event.management.web.data.Event;

/**
 * EventService est la classe du service d'un �v�nement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
public class EventService {

	public static HashMap<Integer, Event> EVENT_DATA = new HashMap<Integer, Event>();
	
	/**
	 * M�thode permettant de r�cup�rer le nouvel identifient.
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
	 * M�thode permettant d'ajouter un �v�nement.
	 *  
	 * @param event
	 * @return L'�v�nement ajout� ou null en cas d'erreur.
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
	 * M�thode permettant de r�cup�rer les �v�nements � partir d'une r�gion.
	 *  
	 * @param area
	 * @return Retourne un tableau d'�v�nement.
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
	 * M�thode permettant de r�cup�rer les �v�nements � partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'�v�nement.
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
	 * M�thode permettant de r�cup�rer tout les �v�nements.
	 *  
	 * @return Retourne un tableau d'�v�nement.
	 *
	 */
	public Event[] getAllEvents() {
		return EVENT_DATA.values().toArray(new Event[EVENT_DATA.values().size()]);
	}
}
