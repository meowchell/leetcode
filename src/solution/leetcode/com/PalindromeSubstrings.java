package solution.leetcode.com;

/**
 * Created by Huijie on 5/22/18.
 */
public class PalindromeSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i ++){
            for(int j = i+1; j <= s.length(); j++){
                if (isPalindrome(s, i, j)){
                    count++;
                }
            }
        }

        return count;
    }


    boolean isPalindrome(String s, int start, int end){
        String k = s.substring(start, end);
        int i = 0, j = k.length()-1;
        while (i <= j){
            if (k.charAt(i) == k.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

}
