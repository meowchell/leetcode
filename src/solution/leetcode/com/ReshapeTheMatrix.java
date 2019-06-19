package solution.leetcode.com;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int M = nums.length;
        int N = nums[0].length;
        if (M * N != r * c){
            return nums;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++){
            res[i/c][i%c] = nums[i/N][i%N];
        }

        return res;
    }
}
