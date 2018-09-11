package solution.leetcode.com;

/**
 * Created by Huijie on 5/13/18.
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort a = new QuickSort();
        int[] ray = new int[]{1,12,7, 3,4};
//        int[] ray = new int[]{4,1};
        a.quickSort(ray);
        for(int i: ray){
            System.out.println(i);
        }

    }

    public void quickSort(int[] nums){
        helper(nums, 0, nums.length-1);


    }
    public void helper(int[] nums, int start, int high){
        if (start > high){
            return;
        }
        int i = start - 1;

        for (int j = start ; j < high; j++){
            if (nums[j] < nums[high]){
                int temp = nums[j];
                nums[j] = nums[++i];
                nums[i] = temp;
            }

        }
        int pivot = nums[high];
        for (int j = high; j > i+1 ; j --){
            nums[j] = nums[j-1];
        }

        nums[i+1] = pivot;

        helper(nums, start, i);
        helper(nums,i+2 , high);

    }

}
