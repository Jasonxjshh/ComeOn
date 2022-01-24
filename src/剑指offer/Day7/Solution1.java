package 剑指offer.Day7;



public class Solution1 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
       if (A==null||B==null){
           return false;
       }
       return helper(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    public boolean helper(TreeNode A,TreeNode B){
        if (A==null&&B!=null){
            return false;
        }
        if (B==null){
            return true;
        }
        return A.val==B.val && helper(A.left,B.left)&&helper(A.right,B.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
