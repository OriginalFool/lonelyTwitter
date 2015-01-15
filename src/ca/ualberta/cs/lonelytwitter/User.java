package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User implements UserLike { 
	//abstract prevents user from being an object. Must be a subclass of user instead.
	//super class is object, not shown.
	protected String username;

	public String getUsername() {
		return username;
	}

	public abstract void setUsername(String username) throws IOException;
	//all subclasses will have, must define in each subclass.

	public User(String username) {
		super();
		this.username = username;
	}
	
	public User() {
		super();
		this.username = "anonymous";
	}
	
	
	
}
