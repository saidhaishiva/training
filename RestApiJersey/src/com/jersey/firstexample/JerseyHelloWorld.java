package com.jersey.firstexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/first")
public class JerseyHelloWorld {
	@GET
	@Path("/welcome")
	@Produces(MediaType.TEXT_PLAIN)
	public String welcome(){
		return "Hello From New Jersey";
	}
}
