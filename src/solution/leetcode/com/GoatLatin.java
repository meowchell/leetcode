package solution.leetcode.com;

import java.util.HashSet;

/**
 * Created by huijiej on 4/30/2018.
 */
public class GoatLatin {

    public String toGoatLatin(String S) {
        String[] words = S.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < words.length; i++){
            sb.append(helper(words[i], i));
            if (i < words.length - 1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public String helper(String word, int d){
        char[] cs = {'a','e', 'i','o', 'u','A','E', 'I','O', 'U'};
        HashSet<Character> vowelSet = new HashSet<>();
        for (char c:cs){
            vowelSet.add(c);
        }
        String lWord;
        if (vowelSet.contains(word.charAt(0))){
            lWord = word+"ma";
        } else {
            lWord = word.substring(1)+word.charAt(0)+"ma";
        }

        while (d-- >= 0){
            lWord+="a";
        }

        return lWord;
    }
}
