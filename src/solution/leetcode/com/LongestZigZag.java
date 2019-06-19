package solution.leetcode.com;

/**
 * Created by huijiej on 4/25/2018.
 */
public class LongestZigZag {

//    Example:[7,5,1,4,3,2,9]

    //    Answer = 4 (The longest pattern is [5,1,4,3])
    public static void main(String[] args) {
        LongestZigZag l = new LongestZigZag();

        int[] a = new  int[2];
        System.out.println(l.longestZigzag(new int[]{7,5,1,4,3,2,9}));;

    }

    public int longestZigzag(int[] nums) {
        int max = 0;
        if (nums == null || nums.length == 0) {
            return max;
        }
        if (nums.length < 3) {//1 or 2
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            int e = helper(nums, i);
            int d = e - i;
            if (d > max) {
                max = d;
            }
        }

        return max;

    }

    public int helper(int[] nums, int start) {
        boolean up = false;    //expecting
        int k = start + 1;
        if (k < nums.length) {
            if (nums[k] > nums[start]) {//1, 4, 2, 0
                up = false;
            } else {
                up = true;
            }
        }
        start = k;
        k++;
        while (k < nums.length) {
            if (up) {
                if (nums[k] < nums[start]) {
                    return k;
                }
            } else if (nums[k] > nums[start]) {
                return k;

            }
            up = !up;
            start++;
            k++;

        }
        return nums.length;

    }

}
