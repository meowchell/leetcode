package solution.leetcode.com;

public class ValidateBST {
    public static void main(String[] args) {
        String s = "abc123";
        String[] lineArray = s.split("\\|");
        for (String l:lineArray){
            System.out.println(l);
        }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null){ return true;}
        boolean left = false;
        boolean right = false;
        if (root.left != null){
            if (root.left .val < root.val){
                left = isValidBST(root.left);
            } else {
                return false;
            }
        }
        if (root.right != null){
            if (root.right .val > root.val){
                right = isValidBST(root.right);
            } else {
                return false;
            }
        }
        return left||right;
    }

}
