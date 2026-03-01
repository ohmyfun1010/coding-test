package org.src;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null) return false;
        if(root.left==null && root.right==null && root.val == targetSum) return true;
        if(dfs(root.left,root.val,targetSum)){
            return true;
        }
        if(dfs(root.right,root.val,targetSum)){
            return true;
        }

        return false;

    }
    public boolean dfs(TreeNode root,int sum,int targetSum){

        if(root==null) return false;
        if(root.left==null && root.right==null && root.val+sum==targetSum) return true;

        if(root.left!=null) {
            if(dfs(root.left,root.val+sum,targetSum)) return true;
        }
        if(root.right!=null) {
            if(dfs(root.right,root.val+sum,targetSum)) return true;
        }

        return false;

    }
    public static void main(String[] argc){
        PathSum main = new PathSum();

//        // 2. 트리 레벨별 생성 및 연결
//        TreeNode root = new TreeNode(5);
//
//        // Level 1
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(8);
//
//        // Level 2
//        root.left.left = new TreeNode(11);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//
//        // Level 3 (Leaf Nodes)
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right.right.right = new TreeNode(1);

        TreeNode root = new TreeNode(1);

        System.out.println(main.hasPathSum(root,1));
    }
}
