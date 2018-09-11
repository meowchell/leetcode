package solution.leetcode.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Huijie on 9/8/18.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] ret = new int[2];
        Map<Integer, Integer> compleMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (compleMap.containsKey(nums[i])){
                ret[0] = compleMap.get(nums[i]);
                ret[1] = i;
                break;
            }
            compleMap.put(target - nums[i], i);
        }

        return ret;
    }

}
