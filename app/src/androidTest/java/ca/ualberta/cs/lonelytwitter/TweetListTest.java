package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by cole on 13/02/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try{
            tweets.add(tweet);
        } catch (IllegalArgumentException e){
            assertTrue(Boolean.TRUE);
        }

    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        Tweet tweet2 = new NormalTweet("Hello");
        tweet2.setDate(tweet.getDate());

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try{
            tweets.add(tweet2);
        } catch (IllegalArgumentException e){
            assertTrue(Boolean.TRUE);
        }
    }

    public void testGetTweet(){
        // using index
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        NormalTweet returnedTweet = (NormalTweet) tweets.getTweet(0);
        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Hello");
        Tweet tweet2 = new NormalTweet("Test");
        Tweet tweet3 = new NormalTweet("Bye");
        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        ArrayList<Tweet> sortedTweets = tweets.getTweets();

        for(int i = 0; i < sortedTweets.size()-1; i++){
            assertFalse(sortedTweets.get(i).getDate().after(sortedTweets.get(i+1).getDate()));
        }
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Hello");
        Tweet tweet2 = new NormalTweet("Test");
        Tweet tweet3 = new NormalTweet("Bye");
        assertTrue(tweets.getCount() == 0);

        tweets.add(tweet1);
        assertTrue(tweets.getCount() == 1);

        tweets.add(tweet2);
        assertTrue(tweets.getCount() == 2);

        tweets.add(tweet3);
        assertTrue(tweets.getCount() == 3);
    }
}
