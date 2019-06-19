package solution.leetcode.com;

/**
 * Created by huijiej on 4/3/2018.
 */
public class PlusOne {
    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        System.out.println(p.plusOne(new int[]{0}));

    }
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;

        }
        int[] retVal = new int[n+1];
        retVal[0] = 1;
        return retVal;


    }
}
