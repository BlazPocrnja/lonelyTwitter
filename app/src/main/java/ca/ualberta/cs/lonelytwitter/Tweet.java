package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private List<mood> moodList;

    public Tweet(String message){
        this.message = message;
        moodList = new ArrayList<mood>();
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
        moodList = new ArrayList<mood>();
    }


    public abstract Boolean isImportant();




    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void addMood(mood m) {
        this.moodList.add(m);
    }

    public List<mood> getMoods(){
        List<mood> tmp = new ArrayList<mood>(moodList);
        return tmp;
    }

    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }
}
