package solution.leetcode.com;

/**
 * Created by Huijie on 5/14/18.
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] a = new int[]{1,3,2,4};
        m.mergeSort(a);
    }
    public void mergeSort(int[] nums){
        //divide
        helper(nums, 0, nums.length - 1);

    }
    public void helper(int[] nums, int start, int end){
       if (start < end){
          int m = (start + end) / 2;
           helper(nums, start, m);
           helper(nums, m+1, end);
           merge(nums, start, m , end);
       }


    }
    public int[] merge(int[] nums, int start, int m, int end){
        int rs = m+1;

        int[] res = new int[nums.length];
        int i = 0;
        while (start <= m && rs <= end) {
            if (nums[start] > nums[rs]){
                res[i++] = nums[rs++];
            } else {
                res[i++] = nums[start];
            }

        }
        while (start<=m){
            res[i++] = nums[start++];
        }
        while (rs<=end){
            res[i++] = nums[rs++];
        }


        return res;
    }

}
