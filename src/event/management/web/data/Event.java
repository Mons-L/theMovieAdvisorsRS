package event.management.web.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Event {
	private Integer id;
	private String name;
	private String date;
	private String area;
	private Artist artist;
	
	public Event() {}
	
	public Event(int id, String name, String date, String area, Artist artist) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.area = area;
		this.artist = artist;
	}
	
	public Event(String name, String date, String area, Artist artist) {
		this.id = null;
		this.name = name;
		this.date = date;
		this.area = area;
		this.artist = artist;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", date=" + date + ", area=" + area + ", artist=" + artist + "]";
	}
	
}
