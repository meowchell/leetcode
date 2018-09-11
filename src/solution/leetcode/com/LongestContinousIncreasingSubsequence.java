package solution.leetcode.com;

/**
 * Created by Huijie on 5/22/18.
 */
public class LongestContinousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int temp = 1;
        int i = 1;
        while (i < nums.length){
            if (nums[i] > nums[i-1]){
                temp ++;
            }else {
                max = Math.max(temp, max);
                temp = 1;
            }
            i++;
        }

        max = Math.max(temp, max);
        return max;
    }
}
