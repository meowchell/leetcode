package solution.leetcode.com;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        //row
        int rolen = A.length;
        //column
        int colen = A[0].length;
        int[][] res = new int[colen][rolen];
        for (int i = 0; i < rolen; i++){
            for (int j = 0; j < colen; j++){
                res[j][i] = A[i][j];
            }
        }

        return res;
    }
}
