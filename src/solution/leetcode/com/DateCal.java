package solution.leetcode.com;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by huijiej on 4/14/2017.
 */
public class DateCal {
    public  static Logger LOGGER = Logger.getLogger(DateCal.class.getName());

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date endDate= cal.getTime();
        LOGGER.info("end "+endDate.toString());
        cal.add(Calendar.DATE, -30);
        Date startDate = cal.getTime();
        LOGGER.info("start" +startDate.toString());
        LOGGER.info("end" +endDate.toString());
    }
}
