package ca.ualberta.cs.lonelytwitter;


public class Reader extends User {
	
	@Override
	public void setUsername(String x) {
		//does not have to implement the throw from user
		if(x.length() <= 8){
			throw new RuntimeException("Name too short!"); //don't catch RuntimeExceptions usually.
		}
		username = x;
	}
}
