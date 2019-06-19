package oa.amazon.com;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    public static void main(String[] args) {
        List<List<Integer>> fwd = new ArrayList<>();
//        fwd.add(Arrays.asList(1,3000));
//        fwd.add(Arrays.asList(2,5000));
//        fwd.add(Arrays.asList(3,7000));¡
//        fwd.add(Arrays.asList(4,10000));
        fwd.add(Arrays.asList(1,5));
        fwd.add(Arrays.asList(2,5));
        fwd.add(Arrays.asList(3,5));

        List<List<Integer>> rtn = new ArrayList<>();
        rtn.add(Arrays.asList(1,15));
        rtn.add(Arrays.asList(2,15));
        rtn.add(Arrays.asList(3,15));
//        rtn.add(Arrays.asList(4,5000));
        Solution c = new Solution();
        int maxTravelDistance = 20;
        System.out.println(c.optimalUtilization(maxTravelDistance, fwd, rtn));

    }


List<List<Integer>> optimalUtilization(
        int deviceCapacity,
        List<List<Integer>> foregroundAppList,
        List<List<Integer>> backgroundAppList)
        {
        // WRITE YOUR CODE HERE
        List<List<Integer>> ret = new ArrayList<>();
        if(deviceCapacity <= 0){
        return ret;
        }

        //sorted descending
        foregroundAppList.sort(new Comparator<List<Integer>>(){
@Override
public int compare(List<Integer>l1, List<Integer> l2){
        return l2.get(1) - l1.get(1);

        }
        });
        //sorted ascending
        backgroundAppList.sort(new Comparator<List<Integer>>(){
@Override
public int compare(List<Integer>l1, List<Integer> l2){
        return l1.get(1) - l2.get(1);

        }
        });

            int f = 0;
            int b = 0;
            int max = 0;
            Map<Integer, List<List<Integer>>> pairMap = new HashMap<>();
            while(f < foregroundAppList.size() && b < backgroundAppList.size()){
                List<Integer> fApp = foregroundAppList.get(f++);
                List<Integer> bApp = backgroundAppList.get(b);
                while(f< foregroundAppList.size() && fApp.get(1) + backgroundAppList.get(b).get(1) > deviceCapacity){
                    fApp = foregroundAppList.get(f++);

                }
                while(b< backgroundAppList.size() && fApp.get(1) + backgroundAppList.get(b).get(1) <= deviceCapacity){
                    bApp = backgroundAppList.get(b++);
                    if(fApp.get(1) + bApp.get(1) == deviceCapacity){
                        break;
                    }
                }

                int sum = fApp.get(1) + bApp.get(1);
                if(sum >= max && sum <= deviceCapacity){
                    max = sum;
                    if(!pairMap.containsKey(sum)){
                        pairMap.put(sum, new ArrayList<>());
                    }
                    pairMap.get(sum).add(Arrays.asList(fApp.get(0), bApp.get(0)));

                }


            }
            ret = pairMap.get(max);
            return ret;
        }

}