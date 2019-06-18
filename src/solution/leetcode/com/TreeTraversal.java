package solution.leetcode.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
        String s = "854529790";
        String[] trackingNoArray = s.split(",");
        for (String a:trackingNoArray ){
            System.out.println(a);
        }

    }
    // middle, left, right
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            TreeNode cur = s.pop();
            if (cur != null){
                 ret.add(cur.val);
                s.push(cur.right);
                s.push(cur.left);
            }
        }


        return ret;
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (!s.isEmpty()){
            while (cur != null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.peek();
            while (cur.right ==null){
                ret.add(cur.val);
                cur = s.pop();

            }
            cur = cur.right;
        }
        return ret;
    }

}
