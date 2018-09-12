package solution.leetcode.com;

import java.util.Arrays;

/**
 * Created by huijiej on 3/23/2018.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int retVal = 0;
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i+=2){
            retVal +=nums[i];
        }
        return retVal;
    }
}
