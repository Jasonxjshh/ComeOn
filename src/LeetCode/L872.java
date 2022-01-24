package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L872 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode root2 = new TreeNode(1,new TreeNode(3),new TreeNode(2));
        List<Integer> list = new ArrayList<>();
        System.out.println(new L872().leafSimilar(root1,root2));
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getLeaves(root1, list1);
        getLeaves(root2,list2);
        if (list1.size()!=list2.size()){
            return false;
        }
//        for (int i = 0; i < list1.size(); i++) {
//            if (!list1.get(i).equals(list2.get(i))){
//                return false;
//            }
//        }
        System.out.println(list1.equals(list2));
        return true;
    }

    public static void getLeaves(TreeNode root, List<Integer> list){

        if (root.left==null&&root.right==null){
            list.add(root.val);
        }
        else {
            if (root.left!=null){
                getLeaves(root.left,list);
            }
            if (root.right!=null){
                getLeaves(root.right,list);
            }

        }
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
 }
