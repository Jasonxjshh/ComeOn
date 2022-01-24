package 剑指offer.Day7;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
