package solution.leetcode.com;

/**
 * Created by huijiej on 4/12/2018.
 */
public class LongestPalindromicSubstring {
    int maxLen=0;
    int low=0;
    public static void main(String[] args) {
        LongestPalindromicSubstring s = new LongestPalindromicSubstring();
        System.out.print(s.longestPalindrome1("aa"));
    }

    public String longestPalindrome1(String s) {
        if (s==null||s.length() < 2){
            return s;
        }
        String retVal="";

        for (int i = 0; i < s.length()-1; i++){
            helper1(s,i, i);
            helper1(s,i, i+1);
        }
        retVal = s.substring(low, low+maxLen);

        return retVal;
    }
    public void helper1(String s, int i, int j){
        while ( i >= 0 && j < s.length() && s.charAt(i)==s.charAt(j)) {
            i--;
            j++;
        }
        if (maxLen < j - i - 1){
            maxLen = j - i - 1;
            low = i + 1;
        };
    }


    public String longestPalindrome(String s) {
        if (s==null||s.isEmpty()||s.length() == 1){
            return s;
        }
        String retVal="";

        for (int i = 0; i < s.length()-1; i++){
            String a= helper(s,i, i);
            if (a.length() > retVal.length()){
                retVal =a;
            }
            if (s.charAt(i)==s.charAt(i+1)){
                String b=helper(s,i, i+1);
                if (b.length() > retVal.length()){
                    retVal =b;
                }
            }


        }
        return retVal;
    }
    public String helper(String s, int i, int j){
        StringBuffer sb = new StringBuffer();

        int k;
        for (k = 1; k <= i&&(j+k)<(s.length()); k++){
            if (s.charAt(i-k)==s.charAt(j+k)){
                continue;
            }else {
                break;
            }
        }

        sb.append(s.substring(i-k+1,j+k));
        return sb.toString();

    }

}
