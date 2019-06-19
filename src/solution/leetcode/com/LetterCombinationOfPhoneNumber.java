package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    char[][] chars = {{'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}};
    public static void main(String[] args) {
        LetterCombinationOfPhoneNumber l = new LetterCombinationOfPhoneNumber();
        l.letterCombinations("2e3").forEach(e-> System.out.println(e));
    }

    public List<String> letterCombinations(String digits) {
        if (digits!=null&!digits.isEmpty()) return helper(digits);
        return  new ArrayList<>();
    }
    public List<String> helper(String digits){
        List<String> ret = new ArrayList<>();
        if (digits.isEmpty()) return ret;
        int n = digits.charAt(0) - '0';
        if (n > 9 || n < 2){
            return helper(digits.substring(1));
        }
        char[] firstSet = chars[n-2];

        if (digits.length()> 1){
            List<String> rem = helper(digits.substring(1));
            for (char c:firstSet){
                for (String s:rem){
                    StringBuilder sb = new StringBuilder();
                    ret.add(sb.append(c+s).toString());
                }
            }
        } else {

            for (char c:firstSet){
                ret.add(c+"");
            }
        }
        return ret;


    }

}
