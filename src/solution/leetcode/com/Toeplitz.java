package solution.leetcode.com;

public class Toeplitz {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        for (int i = 0; i < M - 1; i ++ ){
            for (int j = 0; j < N - 1; j ++){
                if (matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }

        }

        return true;


    }
}
