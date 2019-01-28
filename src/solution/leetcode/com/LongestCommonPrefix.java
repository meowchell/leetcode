package solution.leetcode.com;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aa", "a"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(strs));

    }
    String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }
        String ret = strs[0];

        for (String s: strs){
            int i;
            for (i = 0; i < Math.min(ret.length(), s.length()); i++){
                if (s.charAt(i) != ret.charAt(i)){
                    break;
                }
            }
            ret = s.substring(0, i);
            if (ret.isEmpty()){
                break;
            }
        }
        return ret;
    }

}
