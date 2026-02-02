package org.src;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        boolean startLeft = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0;i<size;i++){

                TreeNode node = queue.poll();
                int val = node.val;
                list.add(val);

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);

            }

            if(!startLeft){
                Collections.reverse(list);
            }

            startLeft = !startLeft;

            result.add(list);

        }

        return result;
    }

    public static void main(String[] argc){

        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        TreeNode t20 = new TreeNode(20,t15,t7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t3 = new TreeNode(3,t9,t20);
        BinaryTreeZigzagLevelOrderTraversal main = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(main.zigzagLevelOrder(t3));

    }
}
