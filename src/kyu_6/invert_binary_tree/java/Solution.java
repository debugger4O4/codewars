// https://www.codewars.com/kata/55d459414bd7798fc5000081/train/java

package kyu_6.invert_binary_tree.java;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        return root;
    }
}



