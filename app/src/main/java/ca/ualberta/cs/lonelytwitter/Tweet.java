/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018 Team X. CMPUT301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of the license in this project. Otherwise, please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author colemerkosky
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets the tweet's message
     *
     * @return tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() < 140){
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the tweet's date
     *
     * @return tweet date
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Sets the tweet's date
     *
     * @param date date to set tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Indicates whether the tweet is important
     *
     * @return the importance of the tweet
     */
    public abstract Boolean isImportant();

    /**
     * Converts the tweet to a user-readable string
     *
     * @return String form of the tweet
     */
    public String toString(){
        return date.toString() + " | " + message;
    }
}