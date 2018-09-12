package solution.leetcode.com;

import java.util.HashSet;

/**
 * Created by huijiej on 4/5/2018.
 */
public class UniqueMorseCode {
    public static void main(String[] args) {

    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodeDict = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet();
        for (int i = 0; i < words.length; i ++){
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < words[i].length(); j++){
                sb.append(morseCodeDict[words[i].charAt(j)-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
