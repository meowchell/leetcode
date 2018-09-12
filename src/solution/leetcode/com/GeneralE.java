package solution.leetcode.com;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by huijiej on 4/10/2017.
 */
public class GeneralE {
    public static final Logger LOGGER = Logger.getLogger(GeneralE.class.getName());

    public static void main(String[] args) {
        helper1();
    }

    private static void helper1(){
        try {

            try {
                int i =helper();

                LOGGER.info("yes, "+i);

            }catch (Exception e){
                LOGGER.log(Level.SEVERE, "inner try catch",e);
            }


        }catch (Exception e){
            LOGGER.log(Level.SEVERE, "caught exception from sub method which doesn't declare general exception",e);
        }
    }



    private static int helper() {
        try {
            int i = 1/0;
        } catch (ArithmeticException e){
            LOGGER.info("ar exception");
          throw e;
       }catch (Exception e){
            LOGGER.info("exception");
        }
        finally {
            return 2;

        }


    }

}
