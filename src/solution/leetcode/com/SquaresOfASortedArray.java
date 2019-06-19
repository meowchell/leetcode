package solution.leetcode.com;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        SquaresOfASortedArray s = new SquaresOfASortedArray();
        int[] nums = new int[]{-7,-3,2,3,11};
        for (int i: s.sortedSquares0(nums)){
            System.out.println(i);
        }
    }
    public int[] sortedSquares0(int[] A) {
        int[] ret = new int[A.length];
        int j = 0; int k = A.length - 1;
        for (int i = k; i >= 0; i--){
            if (Math.abs(A[j]) >= Math.abs(A[k])){
                ret[i] = A[j]*A[j];
                j++;
            } else {
                ret[i] = A[k]*A[k];
                k--;
            }

        }
        return ret;
    }
    public int[] sortedSquares(int[] A) {
        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++){
            ret[i] = A[i] * A[i];
        }
        Arrays.sort(ret);
        return ret;
    }


}
