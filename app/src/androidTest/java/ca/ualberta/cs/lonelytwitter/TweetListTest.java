package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

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

    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
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
}
