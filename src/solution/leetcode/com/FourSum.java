package solution.leetcode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
//        int[] nums = new int[]{ 0,0,0,0,0};
        int[] nums = new int[]{-3,-2,-1,0,0,1,2,3};
        FourSum f = new FourSum();
        List<List<Integer>> s = f.fourSum(nums, 0);
        s.stream().forEach(e-> System.out.println(e));

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i+3 < nums.length; i++){
            if (i > 0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1; j+2 < nums.length; j++){
                if (j > i+1 &&nums[j]==nums[j-1]){
                    continue;
                }
                int t = target - nums[i] - nums[j];
                int start = j+1;
                int end = nums.length -1;
                while (start < end){
                    if (nums[start]+nums[end]==t){
                        ret.add(Arrays.asList(nums[i], nums[j],nums[start++],nums[end--]));
                        while (start < end && nums[start]==nums[start-1]) start++;
                        while (start < end && nums[end]==nums[end+1]) end--;
                    } else if (nums[start]+nums[end] > t){
                        end --;
                        while (start < end && nums[end]==nums[end+1]) end--;
                    }  else if (nums[start]+nums[end] < t){
                        start++;
                        while (start < end && nums[start]==nums[start-1]) start++;
                    }
                }

            }
        }

        return ret;

    }
}
