package solution.leetcode.com;


public class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] A, int K) {
        int ret = 0;
        int i =0, j = 0;
        int sum = 0;

        for (i = 0; i < A.length; i++){

        }
        return ret;
    }

    public static void main(String[] args) {
        int[] A = new int[]{0,0,0,0};
//        ShortestSubarrayWithSumAtLeastK k = new ShortestSubarrayWithSumAtLeastK();
//        System.out.println(k.shortestPosSubArray(A,0));
        Integer i = (int)Math.floor(1.0*2);
        System.out.println(i);

    }
    //positive number only
    public int shortestPosSubArray(int[] A, int K)  {
        int i = 0, j = 0;
        int d = Integer.MAX_VALUE;
        int sum = 0;
        while (j < A.length ){
            sum += A[j++];

            while (sum >= K && i < j){
                d = Math.min(d, j - i);
                sum -= A[i++];
            }
        }

        return d == Integer.MAX_VALUE? 0:d;

    }
}
