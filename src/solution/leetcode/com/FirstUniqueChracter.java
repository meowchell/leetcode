package solution.leetcode.com;

import java.util.HashMap;

/**
 * Created by huijiej on 4/5/2018.
 */
public class FirstUniqueChracter {
    public int firstUniqChar(String s) {
        char[] sc = s.toCharArray();
        char[] count = new char[26];
        for (int i = 0; i < sc.length; i ++){
            count[sc[i]-'a']++;

        }
        for (int i = 0; i < sc.length; i ++){
            if(count[sc[i]-'a']==1){
                return i;
            }
        }
        HashMap map = new HashMap();

        return -1;


    }

}
