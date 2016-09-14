package ca.ualberta.cs.lonelytwitter;

/**
 * Created by pocrn_000 on 9/13/2016.
 */
public class angryMood extends mood implements MoodInterface {

    public angryMood(){
        super("Angry");
    }

    @Override
    public String format(){
        return ">:(";
    }
}
