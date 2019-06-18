package solution.leetcode.com;

import java.util.*;

/**
 * Created by huijiej on 4/12/2018.
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        int[] nums = new int[]{-3,-2,-5,3,-4};
//        t.threeSum(nums).stream().forEach(e-> System.out.println(e));
        System.out.println(t.threeSumClosest(nums, -1));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i+2 < nums.length ; i++){
            if (nums[i] > 0){
                return ret;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = - nums[i];
            int j = i+1; int k = nums.length - 1;
            while (j < k){
                if (nums[j] + nums[k] == target){
                    ret.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while (j<k && nums[j] == nums[j -1]) j++;
                    while (j<k && nums[k] == nums[k +1]) k--;
                }else if (nums[j] + nums[k] < target){
                    j++;
                }else {
                    k--;
                }
            }
        }

        return ret;
    }
        public List<List<Integer>> threeSum0(int[] nums) { //cannot handle duplicate cases
        List<List<Integer>> ret = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Map<Integer, Integer> comp = new HashMap<>();
            for (int j = i+1; j < nums.length; j++){

                comp.put(-nums[i] + nums [j], j);
            }
            for (int j = i+1; j < nums.length; j++){
                if (comp.containsKey(nums[j]) && comp.get(nums[j])!=j && comp.get(nums[j])!=i){
                    ret.add(Arrays.asList(nums[i], nums[j],-nums[i]-nums[j]));
                }
            }
        }

        return ret;
    }
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = nums[0]+nums[1]+nums[n-1];
        Arrays.sort(nums);

        for (int i = 0; i+2 < n ; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int j = i+1; int k = nums.length - 1;

            while (j < k){
                int result = nums[j] + nums[k] + nums[i];
                if (result == target){
                    return result;
                }else if (result < target){
                    j++;
                }else {
                    k--;
                }
                if (Math.abs(target - result ) < Math.abs(target - sum) ){
                    sum = result;
                }
            }
        }

        return sum;
    }

}
