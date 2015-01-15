package ca.ualberta.cs.lonelytwitter;

public class Friends extends Lists {

	public String message(User u,String s){
		String x ="@" + u.getUsername() + " " + s;
		return x;
		
		
	}
}
