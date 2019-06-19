package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if ((A != null && B!= null && A.length()!= B.length())||(A == null && B!= null) || (A!= null && B == null)){
            return false;
        }
        List<Character> arrayA = new ArrayList<>();
        List<Character> arrayB = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < A.length();i++ ){
            if (A.charAt(i)!=B.charAt(i)){
                arrayA.add(A.charAt(i));
                arrayB.add(B.charAt(i));
            }
        }
        if (arrayA.size() != 2){
            return false;
        }
        if (arrayA.get(0) == arrayB.get(1) && arrayA.get(1) == arrayB.get(0)){
            return true;
        }
        return false;
    }
}
