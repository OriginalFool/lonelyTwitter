package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public abstract class Lists {
	private ArrayList<User> userlist;
	
	public ArrayList<User> getUserlist() {
		return userlist;
	}

	public Lists(User u){
		super();
		this.addtolist(u);
	}
	
	public Lists(){
		super();
	}
	
	public void  addtolist(User u){
		userlist.add(u);
		
	}
		
	public void removefromlist(User u){
		userlist.remove(u);
		
	}

}
