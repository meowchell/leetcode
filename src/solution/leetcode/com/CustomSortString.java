package solution.leetcode.com;

/**
 * Created by huijiej on 4/12/2018.
 */
public class CustomSortString {
    public static void main(String[] args) {

    }
    public String customSortString(String S, String T) {

        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        for (char c : S.toCharArray()){
            count[c-'a']++;
        }
        for (char c : T.toCharArray()){
            while (count[c-'a']-->0){
                sb.append(c);
            }
        }
        for (char c = 'a'; c < 'z'; c++){
            while (count[c-'a']-->0){
                sb.append(c);
            }

        }

        return sb.toString();

    }
}
