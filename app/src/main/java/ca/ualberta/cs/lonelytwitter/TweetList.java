package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by cole on 13/02/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<>();

    class SortByDate implements Comparator<Tweet>{
        public int compare (Tweet a, Tweet b){
            if(a.getDate().before(b.getDate())){
                return 1;
            }
            else if (a.getDate().after(b.getDate())){
                return -1;
            }
            return 0;
        }
    }

    public void add(Tweet tweet){
        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        for(int i = 0; i < tweets.size(); i++){
            if (tweets.get(i).equals(tweet)){
                return true;
            }
        }
        return false;
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> sorted_tweets = (ArrayList<Tweet>) tweets.clone();
        Collections.sort(sorted_tweets, new SortByDate());
        System.out.println(sorted_tweets);
        return sorted_tweets;
    }

    public int getCount(){
        if (tweets == null){
            return 0;
        }
        return tweets.size();
    }
}
