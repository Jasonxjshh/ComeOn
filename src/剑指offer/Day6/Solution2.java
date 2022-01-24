package 剑指offer.Day6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
           List<Integer> temp = new LinkedList<>();
            for (int i = queue.size(); i >0; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
