package com.jersey.friends.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.friends.pojo.Friend;
import com.jersey.friends.service.FriendsCollectionService;
	
@Path("/friends")
public class FriendsController {
	
	
	FriendsCollectionService friendsCollectionService = new FriendsCollectionService();
	//CRUD for friends
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List getAllFriends(){
		List allfriends = friendsCollectionService.getAllFriends();
		return allfriends;
	}
	
	//Get the name of friend by id
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend getFriendById(@PathParam("id") int myId){
		Friend f = friendsCollectionService.getFriendById(myId);
		return f;
	}
	//Update the friend
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> updateFriend(Friend friend){
		//Friend f = friendsCollectionService.updateFriend(friend);
		//return f;
		Friend f = friendsCollectionService.updateFriend(friend);
		System.out.println("Friend is updated: " + f.getName());
		List<Friend> allfriends = friendsCollectionService.getAllFriends();
		return allfriends;
	}
	
	//Delete the friend
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> deleteFriend(@MatrixParam("id") int myId){
		friendsCollectionService.deleteFriend(myId);
		List<Friend> allfriends = friendsCollectionService.getAllFriends();
		return allfriends;
	}
}
