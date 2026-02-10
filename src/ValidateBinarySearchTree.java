package org.src;

import java.util.Queue;
import java.util.LinkedList;

class NodeRange {
    TreeNode node;
    long min;
    long max;

    NodeRange(TreeNode node, long min, long max) {
        this.node = node;
        this.min = min;
        this.max = max;
    }
}

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;

        Queue<NodeRange> queue = new LinkedList<>();
        queue.add(new NodeRange(root, Long.MIN_VALUE, Long.MAX_VALUE));

        while (!queue.isEmpty()) {
            NodeRange current = queue.poll();
            TreeNode node = current.node;

            if (node.val <= current.min || node.val >= current.max) {
                return false;
            }

            //왼쪽이면 최대값이 부모
            if (node.left != null) {
                queue.add(new NodeRange(node.left, current.min, node.val));
            }

            //오른쪽이면 최소값이 부모
            if (node.right != null) {
                queue.add(new NodeRange(node.right, node.val, current.max));
            }
        }

        return true;
    }

    public static void main(String[] argc){

        ValidateBinarySearchTree main = new ValidateBinarySearchTree();

        TreeNode left = new TreeNode(4);
        TreeNode rightLeft = new TreeNode(3);
        TreeNode rightRight = new TreeNode(7);
        TreeNode right = new TreeNode(6, rightLeft, rightRight);

        TreeNode root = new TreeNode(5, left, right);

        System.out.println(main.isValidBST(root));

    }

}
