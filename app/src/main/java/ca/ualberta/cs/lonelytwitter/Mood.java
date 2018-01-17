package ca.ualberta.cs.lonelytwitter;

/**
 * Created by cole on 16/01/18.
 */

import java.util.Date;
import java.util.Calendar;

public abstract class Mood {
    private Date date;

    Mood(){
        this.date = new Date();
    }

    Mood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract String getMood();
}
