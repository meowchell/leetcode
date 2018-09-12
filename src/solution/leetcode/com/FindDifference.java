package solution.leetcode.com;

/**
 * Created by huijiej on 4/5/2018.
 */
public class FindDifference {
    public static void main(String[] args) {
        FindDifference fd = new FindDifference();
        fd.findTheDifference("abcd", "abcde");
        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4)
        {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            ++x;
        }
    }
    public char findTheDifference(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] ltCnt = new int[26];
        for (char c:tc){
            ltCnt[c - 'a']++;
        }
        for (char c:sc){
            ltCnt[c - 'a']--;
        }
        int i;
        for ( i = 0; i < ltCnt.length; i++){
            if (ltCnt[i]>0){
                break;
            }
        }
        return (char)('a'+i);
    }

}
