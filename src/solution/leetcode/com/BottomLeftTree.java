package solution.leetcode.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by huijiej on 4/4/2018.
 */
public class BottomLeftTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
//        TreeNode left1 = new TreeNode(1);
//        TreeNode left2 = new TreeNode(4);
//        root.left = left1;
//        left1.right = left2;
//        root.right = new TreeNode(3);
        BottomLeftTree bt = new BottomLeftTree();
        int a = bt.findBottomLeftValue(root);
        System.out.print(a);

    }

    public int findBottomLeftValue2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null){
                queue.add(root.right);
            }
            if (root.left !=null){
                queue.add(root.left);
            }
        }

        return root.val;
    }

    public int findBottomLeftValue(TreeNode root) {
        int retVal = 0;
        LinkedList<TreeNode> t = new LinkedList<>();
        t.add(root);
        TreeNode bl = helper(t);
        retVal = bl.val;
        return retVal;
    }

    public TreeNode helper(LinkedList<TreeNode> nodeList){
        Iterator iterator = nodeList.iterator();
        LinkedList newList = new LinkedList();
        while (iterator.hasNext()){
            TreeNode n = (TreeNode) iterator.next();
            if (n.right != null){
                newList.add(n.right);
            }
            if (n.left != null){
                newList.add(n.left);
            }
        }
        if (newList.isEmpty()){
            return nodeList.getLast();
        }else {
            return helper(newList);
        }

    }
}
