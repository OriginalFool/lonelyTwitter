package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {

	private ArrayList<LonelyTweetModel> tweetlist;
	private int count;
	
	public TweetList(){
		tweetlist = new ArrayList<LonelyTweetModel>();
	}
	
	public ArrayList<LonelyTweetModel> getTweets() {
		// TODO Auto-generated method stub
		return this.tweetlist;
	}

	public void setTweetlist(ArrayList<LonelyTweetModel> tweetlist) {
		this.tweetlist = tweetlist;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		//return tweetlist.size();
		return count;
	}

	public void addTweet(LonelyTweetModel tweet) {
		// TODO Auto-generated method stub
		tweetlist.add(tweet);
		count++;
		
	}


}
