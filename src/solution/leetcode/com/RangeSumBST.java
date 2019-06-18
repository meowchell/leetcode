package solution.leetcode.com;

public class RangeSumBST {
    public static void main(String[] args) {


    }

    public int rangeSumBST(TreeNode root, int L, int R){
        if (root == null){
            return 0;
        }
        if (root.val < L){
            return rangeSumBST(root.right, L, R);
        }else if (root.val > R){
            return rangeSumBST(root.left, L, R);
        } else {
            return root.val +rangeSumBST(root.left, L, R)+rangeSumBST(root.right, L, R);
        }

    }
}
