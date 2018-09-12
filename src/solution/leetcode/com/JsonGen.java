package solution.leetcode.com;


import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by huijiej on 4/19/2017.
 */
public class JsonGen {
    public static final Logger LOGGER = Logger.getLogger(JsonGen.class.getName());

    public static void main(String[] args) {
        String as = null;
       Integer  a= 1;
        boolean  b=  Boolean.valueOf((String)as);
        System.out.print(b);
    }

    void helper3(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.clear(Calendar.HOUR);
        cal.clear(Calendar.HOUR_OF_DAY);
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MILLISECOND);
        Date endDate = cal.getTime();
        cal.add(Calendar.DATE, -1+1);
        Date startDate = cal.getTime();

        LOGGER.info(startDate.toString());
        LOGGER.info(endDate.toString());
    }
    void helper(){
        boolean flag = Boolean.parseBoolean("true ".trim());
//        System.out.println(flag);
        String regex = "\\d+.\\d+";
        System.out.println("110.0.00".matches(regex));
    }


    void helper1(){

        Calendar today = Calendar.getInstance();
        today.clear(Calendar.HOUR);
        today.clear(Calendar.HOUR_OF_DAY);
        today.clear(Calendar.MINUTE);
        today.clear(Calendar.SECOND);
        today.clear(Calendar.MILLISECOND);

        Calendar lastClaimPendingDate = Calendar.getInstance();
        lastClaimPendingDate.setTime(new Date());
        lastClaimPendingDate.clear(Calendar.HOUR);
        lastClaimPendingDate.clear(Calendar.HOUR_OF_DAY);
        lastClaimPendingDate.clear(Calendar.MINUTE);
        lastClaimPendingDate.clear(Calendar.SECOND);
        lastClaimPendingDate.clear(Calendar.MILLISECOND);
        lastClaimPendingDate.add(Calendar.DATE, 7);  // number of days to add
        if (today.after(lastClaimPendingDate)) {
            LOGGER.info(today.toString()+" is after "+lastClaimPendingDate.toString());
        }
    }

    void helper2(){
        Calendar cal = Calendar.getInstance();
        Date endDate = cal.getTime();
        Calendar from = Calendar.getInstance();
        from.clear(Calendar.HOUR);
        from.clear(Calendar.HOUR_OF_DAY);
        from.clear(Calendar.MINUTE);
        from.clear(Calendar.SECOND);
        from.clear(Calendar.MILLISECOND);
        from.add(Calendar.DAY_OF_YEAR,-100);
        cal.add(Calendar.DATE, -30);
        Date startDate = cal.getTime();
        LOGGER.info(endDate.toString());


    }




}
