package solution.leetcode.com;

/**
 * Created by huijiej on 4/10/2018.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean retVal = false;
        boolean isNegative= false;
        if (x < 0) {
            isNegative = true;
        }
        int y = 0;
        int t = x;
        while (t > 0){
            y = y*10 + t%10;
            t = t/10;
        }
        if (x ==y){
            retVal = true;
        }
        return retVal;
    }
}
