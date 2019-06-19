package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huijiej on 3/23/2018.
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers s = new SelfDividingNumbers();
        System.out.print(s.selfDividingNumbers(1,22));

    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> retVal = new ArrayList<>();
        for (int i = left; i < right+1; i++){
            if (isSelfDividing(i)){
                retVal.add(i);
            }

        }
        return retVal;
    }

    public boolean isSelfDividing(int n){
        boolean retVal = true;
        int rem = 0;
        int d = 0;
        int a = n;
        while (a>0){
            d = a%10;
            if (d==0){
                retVal = false;
                break;
            }
            rem = n%d;
            if (rem!=0){
                retVal = false;
                break;
            }
            a = a/10;

        }
        return retVal;

    }


}
