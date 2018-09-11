package solution.leetcode.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Huijie on 5/8/18.
 */
public class FindAllAnagrams {
    public static void main(String[] args) {
        FindAllAnagrams f = new FindAllAnagrams();
//        System.out.println(f.findAnagrams("cbaebabacd", "abc"));
        System.out.println(f.helper("cdaa", "aad"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int begin = 0 ;
        int end = 0;
        List<Integer>  result = new ArrayList<>();
        int count = map.size();
        while (end < s.length()){
            char ec = s.charAt(end);
            if (map.containsKey(ec)){
                map.put(ec, map.get(ec)-1);
                if (map.get(ec) == 0){
                    count --;
                }
            }
            end++;
            while (count==0){
                if (end - begin == p.length()){
                    result.add(begin);
                }
                char c = s.charAt(begin);
                if (map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                    if(map.get(c) > 0){
                        count++;
                    }
                }
                begin++;

            }


        }
        return result;

    }

    public List helper(String s, String p){

        int[] chars = new int[26];
        List<Integer> result = new ArrayList<>();

        if (s == null || p == null || s.length() < p.length())
            return result;
        for (char c : p.toCharArray())
            chars[c-'a']++;

        int start = 0, end = 0, count = p.length();
        // Go over the string
        while (end < s.length()) {
            // If the char at start appeared in p, we increase count
            if (end - start == p.length() && chars[s.charAt(start++)-'a']++ >= 0)
                count++;
            // If the char at end appeared in p (since it's not -1 after decreasing), we decrease count
            if (--chars[s.charAt(end++)-'a'] >= 0)
                count--;
            if (count == 0)
                result.add(start);
        }

        return result;

    }

}
