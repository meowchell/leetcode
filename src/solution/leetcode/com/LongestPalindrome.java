package solution.leetcode.com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Huijie on 9/8/18.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ccd";
        LongestPalindrome l = new LongestPalindrome();
        System.out.println(l.longestPalindrome0(s));

    }
    public int longestPalindrome0(String s) {
        int max = 0;

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c: s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c, 0)+1);
        }
        boolean addOdd = false;
        int count;
        for (Map.Entry<Character, Integer> e:countMap.entrySet()){
            count = e.getValue();
            if (count%2 == 1){
                max +=count - 1;
                addOdd = true;

            } else {
                max += count;
            }

        }

        if (addOdd){
            max++;
        }
        return max;
    }


}
