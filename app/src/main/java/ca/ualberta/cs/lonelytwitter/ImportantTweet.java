package ca.ualberta.cs.lonelytwitter;

/**
 * This is a subclass of Tweet.
 *
 * @author Blaz
 * @see Tweet
 * @see NormalTweet
 * @see TweetList
 * @see TweetTooLongException
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * This method indicates if the Tweet is of ImportantTweet class.
     *
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
