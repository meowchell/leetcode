package solution.leetcode.com;

import java.util.*;

public class ZigZagConv {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        ZigZagConv z = new ZigZagConv();
        System.out.println(z.convert(s, 4));
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        map.getOrDefault(1,new ArrayList<Integer>()).add(1);
//        System.out.println(map.get(1).toString());

//        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//        map1.put(1, map1.getOrDefault(1,1));
//        System.out.println(map1.get(1));

    }
    public String convert(String s, int numRows) {
        char[] cs = s.toCharArray();
        Map<Integer, List<Character>> map = new HashMap<>();


        for (int i= 0; i < cs.length; i++){
            map.put(i%numRows, map.getOrDefault(i%numRows, new ArrayList<>()));
            List<Character> l = map.get(i%numRows);
            l.add(cs[i]);

        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++){
            List<Character> l = map.get(i);
            for (char c: l)
            sb.append(c);

        }


        return sb.toString();
    }
}
