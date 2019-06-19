package solution.leetcode.com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huijiej on 5/14/2018.
 */
public class SubArraySum {
    public static void main(String[] args) {
        int[] a = new int[]{-1,-1,1};
        SubArraySum s = new SubArraySum();
        System.out.println(s.subarraySum(a,0));
    }
    public int subarraySum1(int[] nums, int k) {
        int res  = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        for (int i = 0 ; i < nums.length; i ++){
            sum += nums[i];
            if (map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 1));
        }


        return res;

    }

    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            int j= i;
            int sum = Integer.MIN_VALUE;
            while (j < nums.length ){
                sum += nums[j++];
                if (sum == k){
                    res++;
                    break;
                } else if (sum > k){
                    break;
                }
            }
        }

        return res;
    }
}
