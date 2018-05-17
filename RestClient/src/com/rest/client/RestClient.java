package com.rest.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;


public class RestClient {
	public static void main(String[] args){
		//System.out.println("Client is working");
		
		ClientConfig config = new ClientConfig();
		
        Client client = ClientBuilder.newClient(config);
		
		WebTarget webtarget= client.target(getCustomURI());
		
		//String response = webtarget.path("restapi").path("first").path("welcome").request().accept(MediaType.TEXT_PLAIN))
		
		String response = webtarget.path("rest")
                .path("first")
                .path("welcome")
                .request()
                .accept(MediaType.TEXT_PLAIN)
                .get(Response.class)
                .toString();
		System.out.println(response);
	}
	
	private static URI getCustomURI(){
		return UriBuilder.fromUri("http://localhost:8080/RestClient").build();
	}
	}
