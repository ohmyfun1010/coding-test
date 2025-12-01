package org.src;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = 0;i<n;i++){
            nums1[m+i] = nums2[i];
        }

        Arrays.sort(nums1);

    }

    public static void main(String[] argc){
        MergeSortedArray main = new MergeSortedArray();
//        main.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
//        main.merge(new int[]{4,0,0,0,0,0},1,new int[]{1,2,3,5,6},5);
//        main.merge(new int[]{0},0,new int[]{1},1);
    }

}
