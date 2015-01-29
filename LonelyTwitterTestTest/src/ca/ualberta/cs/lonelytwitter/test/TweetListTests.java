package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		//ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("TweetList is not initialized", tweetlist.getTweets());
	}
	
	public void testCount() throws Exception{
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetlist.addTweet(tweet);
		assertEquals("This should be zero", 1, tweetlist.getCount());
	}
	
	public void testAddRepetition() throws Exception{
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello", new Date(123));
		tweetlist.addTweet(tweet);
		tweetlist.addTweet(tweet);
	}
	
	public void testGetTweets() throws Exception{
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello", new Date(1));
		NormalTweetModel tweet1 = new NormalTweetModel("This", new Date(2));
		NormalTweetModel tweet2 = new NormalTweetModel("Is", new Date(3));
		tweetlist.addTweet(tweet2);
		tweetlist.addTweet(tweet);
		tweetlist.addTweet(tweet1);
		
		ArrayList<LonelyTweetModel> tweetlist2 = tweetlist.getTweets();
			assertTrue(tweetlist2.get(0).equals(tweet));
			assertTrue(tweetlist2.get(1).equals(tweet1));
			assertTrue(tweetlist2.get(2).equals(tweet2));	
	}
	
	public void testHasTweet() throws Exception{
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello", new Date(123));
		tweetlist.addTweet(tweet);
		
		assertTrue(tweetlist.hasTweet(tweet));
	}
	
	public void testRemove() throws Exception{
		TweetList tweetlist = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello", new Date(1));
		NormalTweetModel tweet1 = new NormalTweetModel("This", new Date(2));
		NormalTweetModel tweet2 = new NormalTweetModel("Is", new Date(3));
		tweetlist.addTweet(tweet2);
		tweetlist.addTweet(tweet);
		tweetlist.addTweet(tweet1);
		
		tweetlist.removeTweet(tweet1);
		assertFalse(tweetlist.hasTweet(tweet1));
	}
	

}
