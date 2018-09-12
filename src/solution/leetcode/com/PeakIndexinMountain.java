package solution.leetcode.com;

public class PeakIndexinMountain {
    public static void main(String[] args) {
        int[] m = new int[]{0,1,2,3,0};
        PeakIndexinMountain p = new PeakIndexinMountain();
        System.out.println(p.peakIndexInMountainArray(m));
    }
    public int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1;
        int m =0;
        while (left < right){
            m = (left + right) / 2;
            if (A[m+1] > A[m] ){ //uphill
                left = m;

            }else if (A[m] < A[m-1]){ // downhill
                right = m;
            } else{
                return m;
            }
        }
        return m;
    }

}
