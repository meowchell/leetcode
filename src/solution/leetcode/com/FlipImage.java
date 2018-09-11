package solution.leetcode.com;

/**
 * Created by Huijie on 5/14/18.
 */
public class FlipImage {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{1,2,3}};
        System.out.println(a.length);

    }
    public int[][] flipAndInvertImage(int[][] A){
        for (int i = 0; i < A.length; i++){
            int j = 0, k = A[i].length - 1;
            while (j <= k){
                int temp = A[i][j];
                A[i][j++] = 1 - A[i][k];
                A[i][k--] = 1 - temp;
            }
        }

        return A;
    }
}
