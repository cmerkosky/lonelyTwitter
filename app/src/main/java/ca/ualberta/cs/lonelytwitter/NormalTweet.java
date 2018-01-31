/*
 * NormalTweet
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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a normal tweet
 *
 * @author colemerkosky
 * @version 1.0
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet{

    /**
     * Constructs an important tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Indicates that the tweet is not important
     *
     * @return tweet's importance (always false)
     */
    @Override
    public Boolean isImportant(){
        return false;
    }
}