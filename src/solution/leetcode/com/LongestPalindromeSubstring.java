package solution.leetcode.com;

public class LongestPalindromeSubstring {
    int max;
    String str="";

    public String longestPalindromeSubstring(String s) {
        int i = 0;

        while (i < s.length()){
            helper(i,i,s);
            helper(i,i+1,s);
            i++;
        }

        return this.str;
    }

    public void helper(int left, int right, String s){
        int ret = 0;
        while (left >= 0 && right < s.length()&&s.charAt(left) == s.charAt(right)){
            ret = right - left + 1;
            left --;
            right ++;

        }
        if (ret > max){
            max = ret;
            str = s.substring(left+1, right);
        }


    }
}
