package event.management.web.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Event est la classe de donnée d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@XmlRootElement
public class Event {
	private Integer id;
	private String name;
	private String date;
	private String area;
	private Artist artist;
	
	/**
	 * Constructeur vide de la classe Artist.
	 */
	public Event() {}
	
	/**
	 * Constructeur de la classe Event.
	 * 
	 * @param id
	 * @param name
	 * @param date
	 * @param area	 
	 * @param artist	 	 
	 *
	 */
	public Event(int id, String name, String date, String area, Artist artist) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.area = area;
		this.artist = artist;
	}
	
	/**
	 * Constructeur de la classe Event.
	 * 
	 * @param name
	 * @param date
	 * @param area	 
	 * @param artist	 	 
	 *
	 */
	public Event(String name, String date, String area, Artist artist) {
		this.id = null;
		this.name = name;
		this.date = date;
		this.area = area;
		this.artist = artist;
	}
	
	/**
	 * Méthode permettant de récupérer l'id de l'évènement.
	 *  
	 * @return L'id de l'évènement (type int).
	 *
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Méthode permettant de modifier l'id de l'évènement.
	 *  
	 * @param id
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Méthode permettant de récupérer le nom de l'évènement.
	 *  
	 * @return L'id de l'évènement (type int).
	 *
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Méthode permettant de modifier le nom de l'évènement.
	 *  
	 * @param name
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Méthode permettant de récupérer la date de l'évènement.
	 *  
	 * @return La date de l'évènement (type String).
	 *
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Méthode permettant de modifier la date de l'évènement.
	 *  
	 * @param date
	 *
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Méthode permettant de récupérer la région de l'évènement.
	 *  
	 * @return La région de l'évènement (type String).
	 *
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * Méthode permettant de modifier la région de l'évènement.
	 *  
	 * @param area
	 *
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	/**
	 * Méthode permettant de récupérer l'artiste de l'évènement.
	 *  
	 * @return L'artiste de l'évènement (type Artiste).
	 *
	 */
	public Artist getArtist() {
		return artist;
	}
	
	/**
	 * Méthode permettant de modifier l'artiste de l'évènement.
	 *  
	 * @param artist
	 *
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	/**
	 * Méthode permettant de récupérer toutes les informations de l'évènement.
	 *  
	 * @return  Toutes les informations de l'évènement (type String).
	 *
	 */
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", date=" + date + ", area=" + area + ", artist=" + artist + "]";
	}
	
}
