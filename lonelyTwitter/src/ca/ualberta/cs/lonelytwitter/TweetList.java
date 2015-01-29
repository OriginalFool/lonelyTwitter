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

	public void addTweet(LonelyTweetModel tweet) throws Exception{
		// TODO Auto-generated method stub
		if(hasTweet(tweet)){
			throw new IllegalAccessException("Already in list");
		}
		int x = 0;
		if(tweetlist.size()>0){
		while(tweet.getTimestamp().after(tweetlist.get(x).getTimestamp())){
			x++;
		}
		}
		tweetlist.add(x, tweet);
		count++;
		
	}

	public boolean hasTweet(LonelyTweetModel tweet) {
		// TODO Auto-generated method stub
		int x=0;
		while(x<tweetlist.size()){
			if(tweetlist.get(x).equals(tweet))
				return true;
		}
			return false;

	}

	public void removeTweet(LonelyTweetModel tweet) {
		// TODO Auto-generated method stub
		int x=0;
		while(x<tweetlist.size()){
			if(tweetlist.get(x).equals(tweet))
				tweetlist.remove(x);
				count--;
		}
		
	}


}
