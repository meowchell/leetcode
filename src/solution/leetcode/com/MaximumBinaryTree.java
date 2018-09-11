package solution.leetcode.com;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Huijie on 5/9/18.
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        TreeNode cur = null;
        Deque<TreeNode> stack = new LinkedList();


        for (int i = 0; i < nums.length ; i ++){
            cur = new TreeNode(nums[i]);
            while (!stack.isEmpty()&&stack.peek().val < nums[i]){
                cur.left = stack.pop();
            }
            if (!stack.isEmpty() && stack.peek().val > nums[i]){
                stack.peek().right = cur;
            }

            stack.push(cur);

        }

        return stack==null? null:stack.removeLast();

    }
}
