package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        DisappearedNumbers d = new DisappearedNumbers();
        int a[]={4,3,2,7,8,2,3,1};

        d.findDisappearedNumbers(a);

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List retList = new ArrayList();
        for (int i = 0; i< nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0 ){
                nums[val] = - nums[val];
            }
        }

        for (int i = 0; i< nums.length; i++ ){
            if (nums[i] > 0){
                retList.add(i+1);
            }
        }
        return retList;
    }
}
