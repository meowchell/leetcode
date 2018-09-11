package oa.amazon.com;

import java.util.*;

/**
 * Created by Huijie on 9/8/18.
 */
public class MostCommonWords {
    public static void main(String[] args) {
//        String str = "Bob's hit a ball, the hit'S BALL flew far'S after it was hit.";
        String str = "Jack and jill went to the market to buy bread and cheese cheese is jack favorite food";
        String[] banned = {"and","he","the","to","is"};
        MostCommonWords m = new MostCommonWords();
        System.out.println(m.findMostCommon(str, banned));
    }

    public List<String> findMostCommon(String str, String[] banned){
        String[] words = str.toLowerCase().replaceAll("[!?',;.]"," ").split("\\s+");
        Set<String> bannedSet = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (String bannedWord: banned){
            bannedSet.add(bannedWord.toLowerCase());
        }

        int max = 0;
        List<String> ret = new ArrayList<>() ;
        for (String word: words){
            if (!bannedSet.contains(word)){
                map.put(word, map.getOrDefault(word, 0)+1);
                if (map.get(word) > max){
                    max = map.get(word);

                }
            }

        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
                if (entry.getValue() == max) {
                    ret.add(entry.getKey());
                }
        }

        return ret;

    }

}
