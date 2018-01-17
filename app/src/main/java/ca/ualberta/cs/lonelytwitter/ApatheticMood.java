package ca.ualberta.cs.lonelytwitter;

/**
 * Created by cole on 16/01/18.
 */

import java.util.Date;

public class ApatheticMood extends Mood {
    ApatheticMood() { super(); }

    ApatheticMood(Date date) { super(date); }

    @Override
    public String getMood() { return "Apathetic";}
}
