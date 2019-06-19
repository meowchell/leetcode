package solution.leetcode.com;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by huijiej on 3/20/2017.
 */
public class Numbers {
    private static final Logger LOGGER = Logger.getLogger( StringTalend.class.getName() );
    private static final HashMap<String, String> map = new HashMap<>(1);
    public static void main(String[] args) {
//        helper();

        map.put("1","hha");
        map.put("2","haha");
        map.put("3","hahaz");
        map.put("d",null);
        for (Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+", "+e.getValue());
        }
        String remove = map.remove("d");
        if (remove != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }


    }

    private static void helper() {
        BigInteger balance = null;
        Integer pointsToRedeem = 12;
        if (balance !=null) {

            if (BigInteger.valueOf(pointsToRedeem).compareTo(balance) > -1) {
                pointsToRedeem -= balance.intValue();
            }
        }
        LOGGER.info("pointsToRedeem = "+pointsToRedeem);


    }


}
