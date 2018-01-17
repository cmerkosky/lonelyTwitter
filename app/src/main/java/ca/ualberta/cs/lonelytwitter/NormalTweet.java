package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public class NormalTweet extends Tweet{
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, ArrayList<Mood> moods){
        super(message, moods);
    }

    NormalTweet(String message, Mood mood){
        super(message, mood);
    }

    NormalTweet(String message, Date date){
        super(message);
    }

    NormalTweet(String message, Date date, ArrayList<Mood> moods) { super(message, date, moods); }

    NormalTweet(String message, Date date, Mood mood) { super(message, date, mood); }

    @Override
    public Boolean isImportant(){
        return false;
    }
}