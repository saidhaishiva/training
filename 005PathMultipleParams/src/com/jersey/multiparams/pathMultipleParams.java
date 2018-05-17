package com.jersey.multiparams;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloTest")
public class pathMultipleParams {
	
	 @GET
	 @Path("{id}")
	 @Produces(MediaType.TEXT_PLAIN)  
	 public Response getMassegeWithSingleParam(
			                @PathParam("id") String id) {		 
		String output = "RESTful WS Jersey example. " +
				"Hello your id is : " + id; 
		return Response.status(200).entity(output).build(); 
	 }

	 @GET
	 @Path("{name}/{class}/{rollNo}")
	 @Produces(MediaType.TEXT_PLAIN)  
	 public Response getMassegeWithMultiParam(
		@PathParam("name") String name,
		@PathParam("class") String className, 
		@PathParam("rollNo") String rollNo) {		 
		String output = "Student Name : " + name + ", Class: " 
				+className+ ", Roll No. : " + rollNo; 
		return Response.status(200).entity(output).build(); 
	 }
}
