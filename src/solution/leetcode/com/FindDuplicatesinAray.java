package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huijie on 9/2/18.
 */
public class FindDuplicatesinAray {
    public static void main(String[] args) {
        FindDuplicatesinAray d =  new FindDuplicatesinAray();
        System.out.println(d.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));

    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length ; i ++){
            if (nums[Math.abs(nums[i]) - 1] < 0){
                ret.add(Math.abs(nums[i]));
                continue;
            }
            nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1] ;

        }

        return ret;

    }

}
