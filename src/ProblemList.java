package org.src;

public class ProblemList {

    public int maxArea(int[] height) {

        int max = 0;
        int start = 0;
        int end = height.length-1;

        while(start<end){
            int h = Math.min(height[start],height[end]);
            int width = end - start;
            max = Math.max(max,h*width);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max;

    }

    public static void main(String[] argc){
        ProblemList pl = new ProblemList();
        int output = pl.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(output);
    }

}
