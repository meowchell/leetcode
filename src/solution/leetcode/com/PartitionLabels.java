package solution.leetcode.com;

import java.util.LinkedList;

/**
 * Created by huijiej on 5/11/2018.
 */
public class PartitionLabels {
    public static void main(String[] args) {
        String s = "caedbdedda";
//        for (char c: s.toCharArray()){
//            int d = s.lastIndexOf(c);
//            System.out.println(c+": "+d);
//        }
        PartitionLabels p = new PartitionLabels();
        p.partitaionLabels(s);
    }
    public LinkedList partitaionLabels(String s){
        int[] map = new int[26];
        for (char c: s.toCharArray()){
            map[c-'a'] = s.lastIndexOf(c);
        }
        LinkedList<Integer> result = new LinkedList<>();
        int last = 0;
        int start = 0;
        for (int i = 0 ; i < s.length() ; i++){
            last = Math.max(last, map[s.charAt(i)]);
            if (i == last){
                result.add(last - start + 1);
                start = last + 1;
            }
        }
        return result;
    }

    int helper(String s, int start){
        int i = start;
        start = s.lastIndexOf(s.charAt(start));
        while (i < start ){
            if (s.lastIndexOf(s.charAt(i)) > start ){
                start = s.lastIndexOf(s.charAt(i));
            }
            i++;
        }
        return start;

    }
}
