package solution.leetcode.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String J = "az";
        String  S = "a";
        int count = jewelsAndStones.numJewelsInStones(J, S);
        System.out.print(count);
    }

    public int numJewelsInStones(String J, String S) {

        int retVal = 0;
        HashMap jewelSet = new HashMap();
        for (int i =0 ; i < J.length(); i++){
            jewelSet.put(J.charAt(i), 0);
        }
        for (int i =0 ; i < S.length(); i++){
            String key = S.substring(i,i+1);
            if (jewelSet.containsKey(key)){
                retVal++;
            }
        }


        return retVal;

    }
    public int alt(String J, String S){
        int res = 0;
        Set setJ = new HashSet();
        for (char j: J.toCharArray()) setJ.add(j);
        for (char s: S.toCharArray()) if (setJ.contains(s)) res++;
        return res;
    }
}
