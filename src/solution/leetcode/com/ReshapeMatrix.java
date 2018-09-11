package solution.leetcode.com;

/**
 * Created by Huijie on 9/2/18.
 */
public class ReshapeMatrix {
    public static void main(String[] args) {
        ReshapeMatrix r= new ReshapeMatrix();
        int[][] nums = new int[][]{{1,2},{3,4}};
        System.out.println(r.matrixReshape(nums,1,4 ).toString());

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] ret = new int[r][c];
        int m = nums.length;
        int n = nums[0].length;
        if (m * n < r * c){
            return nums;
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j++){
                if (y < c){
                    ret[x][y++] = nums[i][j];

                }else {
                    x++;
                    y = 0;
                    ret[x][y++] = nums[i][j];
                }
            }
        }

        if (x != r - 1 || y != c){
            return nums;
        }
        return ret;
    }

}
