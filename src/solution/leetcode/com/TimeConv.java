package solution.leetcode.com;


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by huijiej on 6/29/2017.
 */
public class TimeConv {
    public static void main(String[] args) {
        helper();

    }
    static void helper(){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("China/Beijing"));
        Date d = calendar.getTime();
        System.out.println(d);

//        Calendar utcTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//        Calendar sydneyTime = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
//        for (int i = 0; i < Calendar.FIELD_COUNT; i++) {
//            sydneyTime.set(i, utcTime.get(i));
//            System.out.println("i = "+i+", time = "+sydneyTime.gett);
//        }

    }


}
