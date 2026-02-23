package org.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class NumberofIslands {

    public int numIslands(char[][] grid) {

        if(grid.length==0 || grid[0].length==0) return 0;

        Queue<Map<String,Integer>> queue = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int cnt = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){

                if(visited[i][j]) continue;
                if(grid[i][j]=='0') {
                    visited[i][j] = true;
                    continue;
                }

                Map<String,Integer> map = new HashMap<>();
                map.put("x",i);
                map.put("y",j);

                queue.add(map);

                while(!queue.isEmpty()){

                    Map<String,Integer> target = queue.poll();
                    int x = target.get("x");
                    int y = target.get("y");

                    if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && visited[x][y]) continue;

                    if(x-1>=0){
                        Map<String,Integer> topTarget  = new HashMap<>();
                        topTarget.put("x",x-1);
                        topTarget.put("y",y);
                        if(grid[x-1][y]=='1' && !visited[x-1][y]) queue.add(topTarget);
                    }

                    if(y-1>=0){
                        Map<String,Integer> leftTarget = new HashMap<>();
                        leftTarget.put("x",x);
                        leftTarget.put("y",y-1);
                        if(grid[x][y-1]=='1' && !visited[x][y-1]) queue.add(leftTarget);
                    }

                    if(y+1<grid[0].length){
                        Map<String,Integer> rightTarget = new HashMap<>();
                        rightTarget.put("x",x);
                        rightTarget.put("y",y+1);
                        if(grid[x][y+1]=='1' && !visited[x][y+1]) queue.add(rightTarget);
                    }

                    if(x+1<grid.length){
                        Map<String,Integer> bottomTarget = new HashMap<>();
                        bottomTarget.put("x",x+1);
                        bottomTarget.put("y",y);
                        if(grid[x+1][y]=='1' && !visited[x+1][y]) queue.add(bottomTarget);
                    }

                    visited[x][y] = true;

                }

                cnt++;

            }
        }

        return cnt;

    }

    public static void main(String[] argc){
        NumberofIslands main = new NumberofIslands();
//        char[][] arr = {
//            {'1', '1', '0', '0', '0'},
//            {'1', '1', '0', '0', '0'},
//            {'0', '0', '1', '0', '0'},
//            {'0', '0', '0', '1', '1'}
//        };
        char[][] arr = {
                {'1'},
                {'1'}
        };
        System.out.println(main.numIslands(arr));
    }

}
