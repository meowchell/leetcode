package solution.leetcode.com;

import java.util.*;

/**
 * Created by Huijie on 9/8/18.
 */
public class MostCommonWord {
    public static void main(String[] args) {
        String str = "Bob's hit a ball, the hit'S BALL flew far'S after it was hit.";
//        String str = "abc,!";
        String[] banned = {"hit"};
        MostCommonWord m = new MostCommonWord();
        System.out.println(m.findMostCommon(str, banned));
    }

    public String findMostCommon(String str, String[] banned){
        String[] words = str.toLowerCase().replaceAll("[!?',;.]"," ").split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (String bannedWord: banned){
            bannedSet.add(bannedWord);
        }

        int max = 0;
        String ret = null ;
        for (String word: words){
            if (!bannedSet.contains(word)){
                map.put(word, map.getOrDefault(word, 0)+1);
                if (map.get(word) > max){
                    ret = word;
                    max = map.get(word);

                }
            }

        }


        return ret;

    }

}
