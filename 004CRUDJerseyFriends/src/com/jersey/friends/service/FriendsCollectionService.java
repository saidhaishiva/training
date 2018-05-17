package com.jersey.friends.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.friends.pojo.Friend;

public class FriendsCollectionService {

	static HashMap<Integer, Friend> friendsMap = new HashMap<Integer, Friend>();
	

	public FriendsCollectionService() {
		super();
		// TODO Auto-generated constructor stub
			
			Friend f1 = new Friend(1,"Koushik","Ngo Colony");
			Friend f2 = new Friend(2,"Siddharth","Thoraipakkam");
			Friend f3 = new Friend(3,"Saravanan","Chennai");
			Friend f4 = new Friend(4,"Sankara","Kanchipuram");
			Friend f5 = new Friend(5,"Shiva","Baku");
			Friend f6 = new Friend(6,"ShivaSankara","Tokyo");
			
			friendsMap.put(1, f1);
			friendsMap.put(2, f2);
			friendsMap.put(3, f3);
			friendsMap.put(4, f4);
			friendsMap.put(5, f5);
			friendsMap.put(6, f6);
	}

	public List getAllFriends(){
        System.out.println(friendsMap.values());
        List friends=new ArrayList<>(friendsMap.values());
		return friends; 
        //return new ArrayList(friendsMap.values());
	}

	public Friend getFriendById(int myId) {
		// TODO Auto-generated method stub
		Friend f = friendsMap.get(myId);
		return f;
		
	}

	public Friend updateFriend(Friend friend) {
		// TODO Auto-generated method stub
		//Friend f = friendsMap.put(friend.getId(),friend);
		//return f;
		friendsMap.put(friend.getId(), friend);
		System.out.println("Updated: " + friend.location + " " + friend.getName()  + " "+ friend.getId());
		return friend;
	}
	
	public void deleteFriend(int myId) {
		friendsMap.remove(myId);
	}

	
	
}
