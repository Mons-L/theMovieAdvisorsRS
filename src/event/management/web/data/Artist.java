package event.management.web.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Artist est la classe de donn�e d'un artiste.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@XmlRootElement
public class Artist {
	private int id;
	private String name;
	private String nationality;
	
	/**
	 * Constructeur vide de la classe Artist.
	 */
	public Artist() {}
	
	/**
	 * Constructeur de la classe Artist.
	 * 
	 * @param id
	 * @param name
	 * @param nationality	 
	 *
	 */
	public Artist(int id, String name, String nationality) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
	
	/**
	 * M�thode permettant de r�cup�rer l'id de l'artiste.
	 *  
	 * @return L'id de l'artiste (type int).
	 *
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * M�thode permettant de modifier l'id de l'artiste.
	 *  
	 * @param id
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * M�thode permettant de r�cup�rer le nom de l'artiste.
	 *  
	 * @return le nom de l'artiste (type String).
	 *
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�thode permettant de modifier le nom de l'artiste.
	 *  
	 * @param name
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * M�thode permettant de r�cup�rer la nationalit� de l'artiste.
	 *  
	 * @return  La nationalit� de l'artiste (type String).
	 *
	 */
	public String getNationality() {
		return nationality;
	}
	
	/**
	 * M�thode permettant de r�cup�rer la nationalit� de l'artiste.
	 *  
	 * @return  La nationalit� de l'artiste (type String).
	 *
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * M�thode permettant de r�cup�rer toutes les informations de l'artiste.
	 *  
	 * @return  Toutes les informations de l'artiste (type String).
	 *
	 */
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", nationality=" + nationality + "]";
	}
	
}
