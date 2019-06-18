package solution.leetcode.com;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray r = new RemoveDuplicateFromSortedArray();
        int[] nums = new int[]{0,0,0,1,1,1,2,3,3,3,4};
        int len = r.removeDuplicates(nums);
        for (int i = 0 ; i < len; i++){
            System.out.println(nums[i]);
        }
    }
    public int removeDuplicates(int[] nums){
        int ret = 1;
        for (int i = 1; i< nums.length; i++){
            int k = i;
            while (i< nums.length && nums[i] <= nums[k-1]){i++;};
            if (i < nums.length){
                nums[ret++] = nums[i];
            }

        }
        return ret;
    }
    public int removeDuplicates0(int[] nums){
        int i = 1;
        for (int n: nums){
            if (n > nums[i-1]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
