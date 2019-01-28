package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();
        System.out.println(p.generateRow(10));
    }
    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        ret.add(pre);
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i+1; j++){
                row.add(pre.get(j-1)+pre.get(j));
            }
            row.add(1);
            pre = row;
            ret.add(pre);
        }

         return ret;
    }

    List<Integer> generateRow(int numRows) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < numRows; i++){
            row.add(1);
            for (int j =  i-1; j > 0; j--){
                row.set(j, row.get(j)+row.get(j-1));

            }
        }
        return row;
    }
}
