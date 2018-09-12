package solution.leetcode.com;

public class PeakElement {
    public static void main(String[] args) {
        PeakElement p = new PeakElement();
        int[] nums = new int[]{2,1};

        System.out.println(p.findPeak(nums));
    }
    public int findPeak(int[] nums){

        if (nums.length == 1){return 0;}
        int[] nums2 = new int[nums.length+2];
        nums2[0] = -2*Integer.MAX_VALUE;
        nums2[ nums2.length - 1 ] = -2*Integer.MAX_VALUE;
        int i = 1;
        for (int n:nums){
            nums2[i++] = n;
        }
        i = 1;
        while (i < nums2.length - 1 ){
            if (nums2[i] > nums2[i+1] && nums2[i] > nums2[i-1]){
                break;
            }
            i++;

        }
        return i-1;
    }


}
