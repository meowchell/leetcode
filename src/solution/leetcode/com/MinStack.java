package solution.leetcode.com;

import java.util.Stack;

/**
 * Created by huijiej on 4/3/2018.
 */
public class MinStack {
    Stack stack;
    int min;
    public MinStack(){
        this.stack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int n){
        this.stack.push(n);
        if (n < min){
            min = n;
        }
    }
    public void pop(){
        this.stack.pop();
    }
    public int getMin(){
        return min;
    }

}
