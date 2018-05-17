package com.jersey.formparameters;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/student")
public class FormParameters {
	 @POST
	 @Path("/add")
	 public Response addStudent(
	  @FormParam("name") String name,
	  @FormParam("mobile") String mobile,
	  @FormParam("rollNo") String rollNo) {	 
		String output = "Student Name: " + name + 
				", Roll No.: " + rollNo+"Mobile No"+mobile; 
		return Response.status(200).entity(output).build(); 
	 }
}
