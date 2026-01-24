package org.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LevelSummary{
    private int cnt;
    private double sum;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}

public class AverageofLevelsinBinaryTree {

    Map<Integer, LevelSummary> map = new HashMap<>();

    public void dfs(TreeNode root,int depth){

        if(map.containsKey(depth)){
            LevelSummary stock = map.get(depth);
            stock.setCnt(stock.getCnt()+1);
            stock.setSum(stock.getSum()+root.val);
        }else{
            LevelSummary stock = new LevelSummary();
            stock.setCnt(1);
            stock.setSum(root.val);
            map.put(depth,stock);
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        if(left!=null) {
            dfs(left,depth+1);
        }
        if(right!=null) {
            dfs(right,depth+1);
        }

    }

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        if(root==null) return result;
        result.add((double) root.val);
        int depth = 1;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if(left!=null) dfs(left,depth);
        if(right!=null) dfs(right,depth);

        for(Map.Entry<Integer, LevelSummary> entry : map.entrySet()){
            LevelSummary stock = entry.getValue();
            result.add(stock.getSum()/stock.getCnt());
        }

        return result;

    }

    public static void main(String[] argc){
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        TreeNode t3 = new TreeNode(20,t4,t5);
        TreeNode t2 = new TreeNode(9);
        TreeNode t1 = new TreeNode(3,t2,t3);
        AverageofLevelsinBinaryTree main =  new AverageofLevelsinBinaryTree();
        System.out.println(main.averageOfLevels(t1));
    }

}
