package solution.leetcode.com;

/**
 * Created by Huijie on 9/7/18.
 */
public class Fibo {
    public static void main(String[] args) {

        Fibo f = new Fibo();
        System.out.println(f.test(1,1));
        System.out.println(f.test(1,2));
        System.out.println(f.test(2,3));
        System.out.println(f.test(3,4));
        System.out.println(f.test(5,5));
        System.out.println(f.test(8,6));
        System.out.println(f.test(13,7));
        System.out.println(f.test(21,8));

    }
    public boolean test(int target, int n){
//        System.out.println(calculateFibo(n));
        return target == calculateFibo(n);
    }

    public int calculateFibo(int n){
        //1,1,2,3,5,8...
        if (n <= 2){return 1;}


        int cur = 1;
        int nextCur = 1;
        for (int i = 2; i < n; i++){
            int temp = cur;
            cur = nextCur + cur;
            nextCur = temp;
        }

        return cur;

    }

}
