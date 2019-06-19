package solution.leetcode.com;

/**
 * Created by huijiej on 2/15/2018.
 */
public class ReverseWords {
    public static void main(String[] args) {
        String a = "the sky";
        ReverseWords r = new ReverseWords();
//        r.reverseWords(a.toCharArray());
        char ac = 'c';
        char b = ac;
        System.out.print(ac==b);

    }
    public void reverseWords(char[] s) {
        System.out.print(s.toString());
        int i=0;
        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
            }
        }

        reverse(s, i, s.length-1);
        reverse(s, 0, s.length-1);
        for (int k = 0; k < s.length; k++){
            System.out.print(s[k]);
        }

    }

    public void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
