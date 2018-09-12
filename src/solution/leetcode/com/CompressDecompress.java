package solution.leetcode.com;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by huijiej on 9/7/2017.
 */
public class CompressDecompress {
//    Log log = LogFactory.getLog(CompressDecompress.class);
    public static void main(String[] args) {
        CompressDecompress c = new CompressDecompress();
        c.helper("2[3[a]]b");

    }
    void helper(String compressedString){
        Stack<String> s = new Stack();
        char[] chars = compressedString.toCharArray();

        List<Integer> numbers = new ArrayList<>();
        boolean flag = false;
        String tmp = "";
        int end = 0;
        int start = 0;
        int i = 0;
        while (end < chars.length){
//            log.info("start = "+ start);
            end = sliceString(chars, start);
//            log.info("end = "+ end);
            tmp =compressedString.substring(start,end);
            if (!tmp.isEmpty()){
//                log.info("tmp = "+tmp);
                s.push(tmp);
            }
            end = end+1;
            start = end;
//            log.info("======");
        }


        popStack(s);


    }
    void popStack(Stack<String> src){
        String current = "";
        String element = "";
        Stack<String> target = new Stack<>();
        while (!src.isEmpty()){
            current =src.pop();
            if (isDigit(current.charAt(0))){
                int n = Integer.parseInt(current);
                if (!target.isEmpty()){
                    element = target.pop();
                }
                current = "";
                for (int i = 0; i < n ; i++){
                    current +=element;
                }
                if (!target.isEmpty()){
                    current+=target.pop();
                }
//                log.info("push : "+current);
                target.push(current);
            }else{
                target.push(current);
            }

        }
        System.out.println(target.pop());
    }



    int sliceString(char[] chars, int start){
        char leftB = '[';
        char rightB = ']';
        String retVal = "";
        while (start<chars.length&&chars[start]!=leftB&&chars[start]!=rightB){
            retVal+=chars[start++];
        }
        if (start>=chars.length){
            start = chars.length;
        }
        return start;
    }


    boolean isDigit(char c){
        boolean retVal = false;
        if (c>'0'&&c<'9'){
            retVal = true;
        }
        return retVal;
    }

}
