package solution.leetcode.com;

import java.util.Stack;

/**
 * Created by huijiej on 4/3/2018.
 */
public class MinStack {
    Stack<Element> stack;
    int min;
    public MinStack(){
        this.stack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int n){
        if(stack.isEmpty()){
            this.stack.push(new Element(n, n));
        } else {
            int curMin = this.stack.peek().min;
            if (curMin > n){
                this.stack.push(new Element(n, n));
            } else {
                this.stack.push(new Element(curMin, n));
            }
        }
    }
    public void pop(){
        this.stack.pop();
    }

    public int top() {
        if (!stack.isEmpty()){
            return this.stack.peek().val;
        }
        return 0;
    }
    public int getMin(){
        if (!stack.isEmpty()){
            return stack.peek().min;
        }
        return 0;
    }

    public class Element{
        int val;
        int min;
        public Element(int min, int val){
            this.min = min;
            this.val = val;
        }
    }
}
