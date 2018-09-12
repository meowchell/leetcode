package solution.leetcode.com;

public class JumpGame {
    public boolean canJump(int[] nums){
        boolean flag = false;
        int n = nums.length;
        int target = n - 1;
        int i ;
        for(i = n - 2; i >=0 ; i --){
            if (nums[i] + i >= target){
                target = i;
            }
        }

        return target==0;


    }
}
