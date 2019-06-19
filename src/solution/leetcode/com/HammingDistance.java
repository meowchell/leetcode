package solution.leetcode.com;

/**
 * Created by huijiej on 12/21/2017.
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hd = new HammingDistance();
        int d = hd.hammingDistance2(0,7);
        System.out.println(d);
    }
    public int hammingDistance2(int x, int y) {

        int retVal = 0;
        int d = x ^ y;
        int b = 0;
        while (d!=0){
            b = d%2;
            if (b!=0){
                retVal++;
            }
            d =d/2;

        }

        return retVal;
    }

    public int hammingDistance(int x, int y) {

        int retVal = 0;
        if (x==y){
            return retVal;
        }
        if(x>y){
           retVal = helper(x,y);
       }else {
            retVal = helper(y, x);
        }

        return retVal;
    }

    int helper(int x, int y){
        int diff = 0;
        int xt, yt;
        while (y!=0){
            xt = x%2;
            yt = y%2;
            if (xt!=yt){
                diff++;
            }
            x = x/2;
            y = y/2;
        }

        while (x!=0){
            xt = x%2;
            if (xt==1){
                diff++;
            }
            x=x/2;
        }

        return  diff;
    }
}
