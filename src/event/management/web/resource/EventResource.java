package event.management.web.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.*;

import event.management.web.data.Artist;
import event.management.web.data.Event;
import event.management.web.service.EventService;

@Path("/events")
public class EventResource {
	EventService service = new EventService();
	
	@Context
	UriInfo uriInfo;
	
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
	
	/*
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Response deleteStudent(@PathParam("id") int id) {
	if(service.deleteStudent(id) == false) {
	return Response.status(Response.Status.NOT_FOUND).build();
	}
	return Response.status(Response.Status.OK).build();
	}*/
	
	
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
	
	@GET
	@Path("/artist/{id}")
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


}
