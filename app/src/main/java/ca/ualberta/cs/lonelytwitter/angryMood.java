package ca.ualberta.cs.lonelytwitter;

/**
 * Created by pocrn_000 on 9/13/2016.
 */
public class angryMood extends mood implements MoodInterface {

    public angryMood(String mood){
        super(mood);
    }

    @Override
    public String format(){
        return ">:(";
    }
}
