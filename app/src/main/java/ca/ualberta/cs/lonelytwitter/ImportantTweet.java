package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public class ImportantTweet extends Tweet{
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, ArrayList<Mood> moods){
        super(message, moods);
    }

    ImportantTweet(String message, Mood mood){
        super(message, mood);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    ImportantTweet(String message, Date date, ArrayList<Mood> moods) { super(message, date, moods); }

    ImportantTweet(String message, Date date, Mood mood){ super(message, date, mood); }

    @Override
    public Boolean isImportant(){
        return true;
    }
}