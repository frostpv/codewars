package cata8;

public class HelpAlex {
    private final static String GREAT_JOB = "Great, now move on to tricks";
    private final static String KEEP_GOING = "Keep at it until you get it";

    public static String hoopCount(int n){
        return n >= 10 ? GREAT_JOB : KEEP_GOING;
    }
}
