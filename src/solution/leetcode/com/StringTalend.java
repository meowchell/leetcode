package solution.leetcode.com;


import java.util.logging.Logger;

/**
 * Created by huijiej on 1/6/2017.
 */
public class StringTalend {
    private static final Logger LOGGER = Logger.getLogger( StringTalend.class.getName() );
    public static void main(String[] args) {
        String token_name = "POINTS_EXPIRING_14DAYS";
        String[] words = token_name.split("_");
        LOGGER.info(words[words.length-1]);

    }
    public void helper(){
        String a="";
        if (a.equals("12")){
            LOGGER.info("12");
        }

        a = "12";
        if (a.equals("12")) {
            System.out.println("haha");
        } else {
            return;
        }
    }

}
