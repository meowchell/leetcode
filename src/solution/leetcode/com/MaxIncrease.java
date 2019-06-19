package solution.leetcode.com;

/**
 * Created by huijiej on 4/13/2018.
 */
public class MaxIncrease {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] columnMax = new int[grid[1].length];
        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[i].length; j ++){
                if (grid[i][j] > rowMax[i]){
                    rowMax[i] = grid[i][j];
                }
                if (grid[i][j] > columnMax[j]){
                    columnMax[j] = grid[i][j];
                }
            }
        }
        int increase = 0;
        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[i].length; j ++){
                increase += Math.min(rowMax[i], columnMax[j]) - grid[i][j];
            }
        }
        return increase;
    }
}
