package solution.leetcode.com;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        ReverseWordsInStringIII s= new ReverseWordsInStringIII();
        System.out.println(s.reverseWords("Let's take LeetCode contest"));
        StringBuilder sb = new StringBuilder("Let's take LeetCode contest");
        sb.reverse();
        System.out.println(sb.toString());
    }

    public String reverseWords(String s){
        char[] sc = s.toCharArray();
        for (int i = 0; i < sc.length; i ++){
            int j = s.substring(i).indexOf(" ");
            if (j == -1){
                j = sc.length;
            } else{
                j += i;
            }
            int l = i;
            int r = j - 1;
            i = j;
            while (l <= r){
                char temp = sc[l];
                sc[l++] = sc[r];
                sc[r--] = temp;
            }
        }


        return new String(sc);
    }

}
