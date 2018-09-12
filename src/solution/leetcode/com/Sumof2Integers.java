package solution.leetcode.com;

/**
 * Created by huijiej on 4/10/2018.
 */
public class Sumof2Integers {
    public static void main(String[] args) {
        Sumof2Integers s = new Sumof2Integers();
        System.out.print(s.getSum(1,1));


    }

    public int getSum(int a, int b) {
        return a|b;


    }

}
