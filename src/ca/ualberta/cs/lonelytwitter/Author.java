package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Author extends User {
//subclass of user. Inherits all attributes and methods, but not the constructors.
	
	@Override //just used to show that you're overriding. Will tell you if not actually overriding, otherwise nothing.
	public void setUsername(String x) throws IOException {
		if(x.length()>8){
			throw new IOException("Name too long!");
		}
		this.username = x;
	}
}
