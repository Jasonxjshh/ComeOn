package 剑指offer.Day6;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution1 {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();
        if (root==null){
            return new int[0];
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
        int[] myArray = new int[ans.size()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ans.get(i);
        }
        return myArray;

    }
}
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
