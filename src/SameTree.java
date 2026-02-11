package org.src;

import java.util.*;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            if(node==null) {
                list.add(null);
                continue;
            }else{
                list.add(node.val);
            }

            if(node.left!=null) {
                queue.add(node.left);
            } else {
                queue.add(null);
            }
            if(node.right!=null) {
                queue.add(node.right);
            }else{
                queue.add(null);
            }

        }

        queue = new LinkedList<>();
        queue.add(q);

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            if(node==null) {
                list2.add(null);
                continue;
            }else{
                list2.add(node.val);
            }

            if(node.left!=null) {
                queue.add(node.left);
            } else {
                queue.add(null);
            }
            if(node.right!=null) {
                queue.add(node.right);
            }else{
                queue.add(null);
            }

        }

        for(int i = 0;i<list.size();i++){
            if(!Objects.equals(list.get(i), list2.get(i))){
                return false;
            }
        }

        return true;


    }


    public static void main(String[] argc){
        SameTree main = new SameTree();
        TreeNode left = new TreeNode(2);
        TreeNode mid = new TreeNode(1,left,null);

        TreeNode right2 = new TreeNode(2);
        TreeNode mid2 = new TreeNode(1,null,right2);

        System.out.println(main.isSameTree(mid,mid2));
    }

}
