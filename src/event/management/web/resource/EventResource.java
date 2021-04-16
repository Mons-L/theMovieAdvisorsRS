package event.management.web.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.*;

import event.management.web.data.Artist;
import event.management.web.data.Event;
import event.management.web.service.EventService;

/**
 * EventResource est la classe du service d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@Path("/events")
public class EventResource {
	EventService service = new EventService();
	
	@Context
	UriInfo uriInfo;
	
	/**
	 * Méthode permettant d'ajouter un évènement.
	 *  
	 * @param event
	 * @return Une response.
	 *
	 */
	@POST
	//@Path("addEvent/{name}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response addEvent(Event e) {
	Event event = service.addEvent(e);
	if(event == null) {
		return Response.status(Response.Status.BAD_REQUEST).build();
	}
	URI uri = uriInfo.getRequestUri();
	String newUri = uri.getPath() + "/" + event.getId();
	return Response.status(Response.Status.CREATED)
		.entity(event)
		.contentLocation(uri.resolve(newUri))
		.build();
	}
		
	/**
	 * Méthode permettant de récupérer les évènements à partir d'une région.
	 *  
	 * @param area
	 * @return Une response.
	 *
	 */
	@GET
	@Path("/areas/{area}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEventByArea(@PathParam("area") String area) {
		Event[] events = service.getEventsByArea(area);
		if(events == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		Link link = Link.fromUri(uriInfo.getRequestUri())
			.rel("self")
			.type("application/xml")
			.build();
		return Response.status(Response.Status.OK)
			.entity(events)
			.links(link)
			.build();
	}
	
	/**
	 * Méthode permettant de récupérer les évènements à partir d'un artiste.
	 *  
	 * @param id
	 * @param artiste
	 * @return Une response.
	 *
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEventByArtist(@PathParam("id")int id, @QueryParam("artist")Artist artist) {
		Event[] events = service.getEventsByArtist(id,artist);
		if(events == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		Link link = Link.fromUri(uriInfo.getRequestUri())
			.rel("self")
			.type("application/xml")
			.build();
		return Response.status(Response.Status.OK)
			.entity(events)
			.links(link)
			.build();
	}
	
	/**
	 * Méthode permettant de récupérer tout les évènements.
	 *  
	 * @return Une response.
	 *
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllEvents() {
		return Response.status(Response.Status.OK)
	                   .entity(service.getAllEvents())
	                   .build();
	  }


}
