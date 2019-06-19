package solution.leetcode.com;


/**
 * Created by huijiej on 12/1/2017.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger a = new ReverseInteger();
        int r =a.helper(-15632799);
        System.out.println("r = "+r);

    }

    int helper(Integer n){
        int ret = 0;
        while (n>0) {
            int mod = n%10;

            int oldRet = ret;
            ret = ret * 10 + mod;
            if ((ret - mod)/10 !=oldRet){
                ret = 0;
                break;
            }
            n /=10;
        }
        return ret;
    }
}
