package solution.leetcode.com;

/**
 * Created by Huijie on 5/23/18.
 */
public class OneEditDistance {
    public static void main(String[] args) {
        OneEditDistance e = new OneEditDistance();
        System.out.println(e.isOneEditDistance("pale","bake"));

    }
    public boolean isOneEditDistance(String s1, String s2){
        boolean flag = false;
        int l1, l2;
        if (s1 == null||s2.isEmpty()){
            l1 = 0;
        }
        if (s2 == null|| s2.isEmpty()){
            l2 = 0;
        }
        l1 = s1.length();
        l2 = s2.length();
        int diff = Math.abs( l1- l2);
        if (diff > 1){
            return flag;
        }

        diff = 0;
        int i = 0, j = 0;
        while (i < l1 && j < l2){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
                continue;
            } else if (l1 > l2){
                i++;
                diff++;
            } else if (l1 < l2){
                j++;
                diff++;
            } else {
                i++;
                j++;
                diff++;
            }
            if (diff > 1){
                return flag;
            }

        }

        flag = true;


        return flag;
    }
}
