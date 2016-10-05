package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is a subclass of Tweet.
 *
 * @author Blaz
 * @see Tweet
 * @see ImportantTweet
 * @see TweetList
 * @see TweetTooLongException
 */
public class NormalTweet extends Tweet implements Tweetable {

    /**
     * This constructor makes a normalTweet with given string parameter.
     *
     * @param message this parameter is the given string for the tweet.
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the string given for the tweet
     * @param date    the date given for the tweet
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * This method indicates if the Tweet is of ImportantTweet class.
     *
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
