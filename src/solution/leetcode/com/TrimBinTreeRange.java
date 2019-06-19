package solution.leetcode.com;

public class TrimBinTreeRange {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        TreeNode right, left;
        if (root==null){
            return root;
        }

        if (this.isOutOfRange(root.val, L, R)) {
            right = root.right;
            left = root.left;
            root = left;
            root.right = right;
        }
        right = trimBST(root.right, L, R);
        left = trimBST(root.left, L, R);


        return root;
    }

    public boolean isOutOfRange(int val, int L, int R){
        if (val <= R && val >= L){
            return false;
        }else {
            return true;
        }
    }
}
