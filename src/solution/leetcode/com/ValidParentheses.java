package solution.leetcode.com;

import java.util.Stack;

/**
 * Created by huijiej on 3/30/2018.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        String s = "([])";
        System.out.print(v.isValid(s));
    }

    public void helper(){
        Stack tak = new Stack();
        if (!tak.isEmpty()){
            System.out.println(tak.peek());
        }

    }

    public boolean isValid(String s) {
        boolean retVal = true;
        if (s.length()%2!=0){
            retVal = false;
            return retVal;
        }
        Stack tak = new Stack();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c=='('||c =='['|| c=='{'){
                tak.push(c);
            }else if (c ==')'){
                if (tak.empty()||(char)tak.pop()!='('){
                    retVal = false;
                    break;
                }
            }else if (c ==']'){
                if (tak.empty()||(char)tak.pop()!='['){
                    retVal = false;
                    break;
                }
            }else if (c =='}'){
                if (tak.empty()||(char)tak.pop()!='{'){
                    retVal = false;
                    break;
                }
            }else {
                retVal = false;
                break;
            }

        }
        if (!tak.isEmpty()){
            retVal = false;
        }

        return retVal;
    }
    public boolean isValid2(String s) {
        boolean retVal = true;
        if (s.length()%2!=0){
            retVal = false;
            return retVal;
        }
        Stack tak = new Stack();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c=='('){
                tak.push(')');
            }else if (c=='['){
                tak.push(']');
            }else if (c=='{'){
                tak.push('}');
            }else if (tak.empty()||(char)tak.pop()!=c){
                    return false;
            }

        }
        if (!tak.isEmpty()){
            retVal = false;
        }

        return retVal;
    }

}
