package solution.leetcode.com;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.helper("dvdf"));

    }

    public int helper(String s){
        if (s==null || s.isEmpty()){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i = 0, j = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (map.get(c) >= j){
                    j = map.get(c)+1;
                }
            }
            map.put(c, i);
            max = Math.max(i - j + 1, max);

        }
        return max;

    }

}
