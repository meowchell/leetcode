package solution.leetcode.com;

/**
 * Created by huijiej on 5/15/2018.
 */
public class ComplementNumber {
    public static void main(String[] args) {
        ComplementNumber c = new ComplementNumber();
        long start = System.currentTimeMillis();
        int n = c.jc(32);
        long end = System.currentTimeMillis();
        System.out.println(n +" " +(end - start));
        start = System.currentTimeMillis();
        n = c.mc(32);
        end = System.currentTimeMillis();
        System.out.println(n +" " +(end - start));

    }
    public int jc (int k){
        int n = 1;
        while (k-- > 0){
            n = n * 2;
        }
        return n;
    }
    public int mc (int k){
        return (int)Math.pow(2, k);
    }


    public int complementNumber(int n){
        int k = 0;
        int i = 0;
        while (i < n){
            i+=Math.pow(2, k++);
        }
        return i - n;

    }

}
