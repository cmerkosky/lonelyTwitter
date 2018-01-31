/*
 * Tweetable
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
 * Interface for indicating an object is Tweetable
 *
 * @author colemerkosky
 * @version 1.0
 * @see Tweet
 */
public interface Tweetable{
    /**
     * Gets the tweet message
     *
     * @return tweet message
     */
    public String getMessage();

    /**
     * Gets the tweet date
     *
     * @return tweet date
     */
    public Date getDate();
}