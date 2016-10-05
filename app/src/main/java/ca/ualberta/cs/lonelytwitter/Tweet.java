package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Main Tweet class. Stores a message and date of message creation.
 *
 * @author Blaz
 * @see ImportantTweet
 * @see NormalTweet
 * @see TweetList
 * @see TweetTooLongException
 */
public abstract class Tweet {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();


    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet was too long
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Converts date and message data to a readable string.
     *
     * @return "date | message"
     */
    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
}
