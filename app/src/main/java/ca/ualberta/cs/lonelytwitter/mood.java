package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by blaz on 9/13/16.
 */
public abstract class mood {

    private Date date;
    private String mood;

    public mood(String mood){
        Date current = new Date();
        this.date = current;
        this.mood = mood;
    }

    public mood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public abstract String format();

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

}
