package solution.leetcode.com;

/**
 * Created by Huijie on 9/2/18.
 */
public class MonotonicArray {
    public static void main(String[] args) {
        MonotonicArray m = new MonotonicArray();
        System.out.println(m.isMonotonic(new int[]{1,2,3,3}));

    }

    public boolean isMonotonic2(int[] A){
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < A.length ; i ++){
            inc &= A[i-1]<=A[i];
            dec &= A[i-1]>=A[i];
        }

        return inc||dec;

    }



    public boolean isMonotonic(int[] A) {

        if (A.length == 1) {
            return true;
        }
        int i = 0;

        while ((i < A.length - 1) && (A[i] <= A[i + 1])) {
            i++;
        }

        if (i == A.length - 1) {
            return true;
        }

        i = 0;

        while ((i < A.length - 1) && (A[i] >= A[i + 1])) {
            i++;
        }


        if (i == A.length - 1) {
            return true;
        }

        return false;


    }
}
