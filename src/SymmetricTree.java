package org.src;

import java.util.*;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            List<Integer> list = new ArrayList<>();
            int size = queue.size();

            for(int i = 0;i<size;i++){

                TreeNode node = queue.poll();
                if(node == null){
                    list.add(999);
                    continue;
                }

                if(node.left!=null)
                {
                    queue.add(node.left);
                }else{
                    queue.add(null);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }else{
                    queue.add(null);
                }
                list.add(node.val);

            }

            int s = 0;
            int e = list.size()-1;

            while(s<=e){
                if(!Objects.equals(list.get(s), list.get(e))){
                    return false;
                }
                s++;
                e--;
            }

        }

        return true;

    }
    public static void main(String[] argc){

        TreeNode root = new TreeNode(4,
                new TreeNode(-57, null, new TreeNode(67, null, new TreeNode(-97))), // Left Subtree
                new TreeNode(-57, new TreeNode(67, new TreeNode(-97), null), null)  // Right Subtree
        );
        SymmetricTree main = new SymmetricTree();
        System.out.println(main.isSymmetric(root));

    }
}
