package org.src;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        // 3. 왼쪽 영역으로 왼쪽 서브트리 구성
        node.left = buildBST(nums, left, mid - 1);

        // 4. 오른쪽 영역으로 오른쪽 서브트리 구성
        node.right = buildBST(nums, mid + 1, right);

        return node;
    }

    public static void main(String[] argc){
        ConvertSortedArraytoBinarySearchTree main = new ConvertSortedArraytoBinarySearchTree();
        System.out.println(main.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }

}
