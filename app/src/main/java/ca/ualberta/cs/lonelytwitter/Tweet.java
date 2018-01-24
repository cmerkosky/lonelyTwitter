package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    Tweet(String message){
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<Mood>();
    }

    Tweet(String message, ArrayList<Mood> moods){
        this.message = message;
        this.date = new Date();
        this.moods = moods;
    }

    Tweet(String message, Mood mood){
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<Mood>();
        this.moods.add(mood);
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<Mood>();
    }

    Tweet(String message, Date date, ArrayList<Mood> moods){
        this.message = message;
        this.date = date;
        this.moods = moods;
    }

    Tweet(String message, Date date, Mood mood){
        this.moods = new ArrayList<Mood>();
        this.moods.add(mood);
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() < 140){
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public ArrayList<Mood> getMoods() { return this.moods; }

    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    public abstract Boolean isImportant();

    public String toString(){
        return date.toString() + " | " + message;
    }
}