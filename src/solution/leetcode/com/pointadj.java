package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huijiej on 8/4/2017.
 */
public class pointadj {
    public static void main(String[] args) {
//        helper();
        List<Integer> a = new ArrayList<>();
        a.add(null);
        a.add(null);
        a.add(12);

        List<Integer> b = new ArrayList<>();
        for (Integer i: a){
            if (i==null){
                b.add(i);
            }
        }


        a.removeAll(b);

        System.out.print(a.toString());

    }
    static void helper(){


        String file_name = "0_pointadjustment12.15.2016.csv";

        String[] stringArrayFile = file_name.split("_");



            String customer_id1=stringArrayFile[0];
            String point_type_id= stringArrayFile[stringArrayFile.length -2];
            String incentive_instance_id=stringArrayFile[stringArrayFile.length -1];


        System.out.println ("Printing rows");
        System.out.println ("Customer_id1="+ customer_id1);
        System.out.println ("Point Type Id =" + point_type_id);
        System.out.println ("Incentive Instance ID ="+ incentive_instance_id);





    }
}
