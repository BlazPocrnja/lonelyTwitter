package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Calendar;
import java.util.Date;

/**
 * Tests our TweetList class.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Testing...");
        list.add(tweet);

        assertTrue(list.hasTweet(tweet));

        //list.add(tweet);
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet added = new NormalTweet("Testing...");
        Tweet notAdded = new NormalTweet("Testing...");

        assertFalse(list.hasTweet(added));
        list.add(added);

        assertTrue(list.hasTweet(added));
        assertFalse(list.hasTweet(notAdded));
    }

    /**
     * Tests getting tweet by index.
     */
    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        list.add(tweet);

        Tweet returnedTweet = list.getTweet(0);
        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
        assertEquals(tweet.getDate(), returnedTweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        list.add(tweet);
        list.remove(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testCount(){
        TweetList list = new TweetList();
        assertEquals(list.getCount(), 0);

        Tweet tweet1 = new NormalTweet("Hey");
        Tweet tweet2 = new NormalTweet("Hey");

        list.add(tweet1);
        list.add(tweet2);

        assertEquals(list.getCount(), 2);

    }

    public void testchronoTest(){

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,17);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);

        Date d = cal.getTime();

        Tweet tweet1 = new NormalTweet("Made First",d);
        TweetList list = new TweetList();
        Tweet tweet2 = new NormalTweet("Made Second");

        list.add(tweet2);
        list.add(tweet1);

        assertEquals(list.getTweet(0), tweet2);


        TweetList list2 = list.getChronological();

        assertEquals(list2.getTweet(0), tweet1);


    }
}
