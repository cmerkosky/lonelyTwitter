package ca.ualberta.cs.lonelytwitter;

/**
 * Created by cole on 16/01/18.
 */

import java.util.Date;

public class InquisitiveMood extends Mood {
    InquisitiveMood() { super(); }

    InquisitiveMood(Date date) { super(date); }

    @Override
    public String getMood() { return "Inquisitive"; }
}
