package solution.leetcode.com;

/**
 * Created by huijiej on 4/10/2018.
 */
public class GreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return root;
        }
       convert(root);
        return root;
    }

    public void convert(TreeNode cur){
        if(cur==null){
            return;
        }
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);

    }
}
