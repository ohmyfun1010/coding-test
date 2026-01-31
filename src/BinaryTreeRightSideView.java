package org.src;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size(); // 현재 depth 노드 수

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // 이 depth의 마지막 노드
                if (i == size - 1) {
                    result.add(node.val);
                }

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

        }


        return result;


    }

    public static void main(String[] argc){

        TreeNode node5 = new TreeNode(5,null,null);
        TreeNode node4 = new TreeNode(4,node5,null);
        TreeNode node2 = new TreeNode(2,node4,null);
        TreeNode node3 = new TreeNode(3,null,null);
        TreeNode node1 = new TreeNode(1,node2,node3);

        BinaryTreeRightSideView main = new BinaryTreeRightSideView();
        System.out.println(main.rightSideView(node1));

    }

}
