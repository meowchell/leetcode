package solution.leetcode.com;

/**
 * Created by huijiej on 4/26/2018.
 */
public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        NumberOfLinesToWriteString s = new NumberOfLinesToWriteString();
        String S  = "bbbcccdddaaa";
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        s.countLines(S, widths);


    }

    public int[] countLines(String S, int[] widths){
        int[] res = new int[2];
        int unitCount = 100;
        char[] cs = S.toCharArray();
        res[0] = 1;
        for (int i = 0 ; i < cs.length; ){
            if (unitCount < widths[cs[i]-'a']){
                res[0]++;
                unitCount = 100;
            } else {
                unitCount -= widths[cs[i]-'a'];
                i++;
            }

        }

        res[1] = 100 - unitCount;
        System.out.print(res[0]+", "+res[1]);
        return res;
    }
}
