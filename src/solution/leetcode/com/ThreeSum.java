package solution.leetcode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huijiej on 4/12/2018.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-4,-1, -1, 0,1,2};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        ThreeSum t = new ThreeSum();
        List<List<Integer>> retVal = t.threeSum(nums);
        System.out.println(retVal);
    }

    //-4,
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> retVal = new ArrayList<>();
        Arrays.sort(nums);
        int target;
        for (int i = 0; i < nums.length-2; i++){
            if(i>0&&(nums[i] == nums[i-1])){
                continue;
            }
            target = -nums[i];
            int low = i+1;
            int high = nums.length -1 ;
            while (low<high){
                if (nums[low]+nums[high] ==target){
                    retVal.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low<high&&nums[low]==nums[low+1]) low++;
                    while (low<high&&nums[high]==nums[high-1]) high--;
                    low++;
                    high--;
                } else if (nums[low]+nums[high] > target){
                    high --;
                } else {
                    low++;
                }
            }

        }
        return retVal;
    }

}
