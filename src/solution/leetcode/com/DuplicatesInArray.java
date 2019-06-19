package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
    public static void main(String[] args) {
        DuplicatesInArray d = new DuplicatesInArray();
        int a[]={5,4,6,7,9,3,10,9,5,6};

        d.findDuplicates(a);

    }
    public List<Integer> findDuplicates(int[] nums) {
        List retList = new ArrayList();
        for (int i = 0; i< nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] < 0 ) {
                retList.add(Math.abs(nums[i]));
            } else {
                nums[val] = - nums[val];
            }
        }

        System.out.println(retList);
        return retList;
    }
}
