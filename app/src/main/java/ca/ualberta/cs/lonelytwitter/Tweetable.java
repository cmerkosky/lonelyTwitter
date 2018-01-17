package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public interface Tweetable{
    public String getMessage();
    public Date getDate();
    public ArrayList<Mood> getMoods();
}