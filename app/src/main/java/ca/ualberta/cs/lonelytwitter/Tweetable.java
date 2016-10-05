package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Defines what classes are considered "Tweetable"
 * Must have a getMessage()
 * Must have a getDate()
 *
 * @author Blaz
 * @see Tweet
 * @see TweetList
 * @see ImportantTweet
 * @see NormalTweet
 * @see TweetTooLongException
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();
}
