package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by cole on 13/02/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
}
