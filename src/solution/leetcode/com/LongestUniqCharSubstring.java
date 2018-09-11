package solution.leetcode.com;

import java.util.*;

/**
 * Created by Huijie on 9/8/18.
 */
public class LongestUniqCharSubstring {
    public static void main(String[] args) {
        LongestUniqCharSubstring l = new LongestUniqCharSubstring();
        String s = "abba";
        System.out.println(l.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int lo = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                lo = Math.max(map.get(c) + 1, lo);


            }
            map.put(c, i);
            max = Math.max(max, i - lo + 1);
        }
        return max;


    }

    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int lo = 0, hi = 0;
        int max = 0;
        while (lo < s.length() && hi < s.length()){
            if (!set.contains(s.charAt(hi))){
                set.add(s.charAt(hi++));
                max = Math.max(max, set.size());
            } else{
                set.remove((s.charAt(lo++)));
            }




        }

        return max;


    }
}
