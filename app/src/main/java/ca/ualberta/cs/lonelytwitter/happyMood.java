package ca.ualberta.cs.lonelytwitter;

/**
 * Created by pocrn_000 on 9/13/2016.
 */
public class happyMood extends mood implements MoodInterface {

    public happyMood(){
        super("Happy");
    }

    @Override
    public String format(){
        return ":D";
    }
}
