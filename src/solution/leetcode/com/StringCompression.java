package solution.leetcode.com;

import java.util.Stack;

/**
 * Created by Huijie on 5/23/18.
 */
public class StringCompression {
    public static void main(String[] args) {
        StringCompression s= new StringCompression();
        System.out.println(s.helper("aabbbbc"));
    }

    public String helper(String s){
        String res = null;
        Stack<Character> stack = new Stack();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if (!stack.isEmpty()&&stack.peek() == c){
                count++;
            }else if(!stack.isEmpty()){
                sb.append(stack.pop());
                sb.append(count);
                count = 0;
            }
            if (stack.isEmpty()){
                stack.push(c);
                count++;
            }

        }
        sb.append(s.charAt(s.length()-1)).append(count);

        res = sb.toString();


        return res;
    }
}
