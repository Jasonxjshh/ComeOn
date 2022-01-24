package 剑指offer.Day7;

public class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }else {
            return recur(root.left,root.right);
        }
    }
    public boolean recur(TreeNode left, TreeNode right){
        if (left==null&right==null){
            return true;
        }
        if (left==null||right==null||left.val!=right.val){
            return false;
        }
        return recur(left.left,right.right)&&recur(left.right,right.left);
    }
}
