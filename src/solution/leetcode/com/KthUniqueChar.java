package solution.leetcode.com;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by huijiej on 4/5/2018.
 */
public class KthUniqueChar {
    public static void main(String[] args) {
        KthUniqueChar k = new KthUniqueChar();
        System.out.println(k.kthUniqueChar("abcabcdnm",3));

    }
    public Character kthUniqueChar(String s, int k) {
        HashSet<Character> charSet = new HashSet<>();
        LinkedList<Character> list = new LinkedList();
        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (charSet.contains(c)){
                list.remove((Character) c);
            }else {
                charSet.add(c);
                list.add(c);
            }
        }
        if (list.size() < k){
            return null;
        }else {
            return list.get(k-1);
        }




    }

}
