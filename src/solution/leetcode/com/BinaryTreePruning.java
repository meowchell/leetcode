package solution.leetcode.com;

/**
 * Created by huijiej on 4/13/2018.
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null||(root.left == null && root.right == null && root.val==0)){
            return null;
        }
        if (root.left != null){
            root.left = pruneTree(root.left);
        }

        if (root.right != null){
            root.right= pruneTree(root.right);
        }
        if (root.val==0&&root.left==null&&root.right==null){
            root = null;
        }
        return root;
    }


    public TreeNode pruneTree1(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree1(root.left);
        root.right= pruneTree1(root.right);

        if (root.val==0&&root.left==null&&root.right==null){
            root = null;
        }
        return root;
    }
}
