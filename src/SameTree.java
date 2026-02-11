package org.src;

import java.util.*;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();

            // 둘 다 null이면 문제 없음, 다음 노드로 진행
            if (n1 == null && n2 == null) continue;

            // 하나만 null이거나 값이 다르면 즉시 false 반환
            if (n1 == null || n2 == null || n1.val != n2.val) return false;

            // 왼쪽 자식들 쌍으로 추가
            queue.add(n1.left);
            queue.add(n2.left);

            // 오른쪽 자식들 쌍으로 추가
            queue.add(n1.right);
            queue.add(n2.right);
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
