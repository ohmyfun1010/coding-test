package org.src;

import java.util.Arrays;

public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] argc){
        KthLargestElementinanArray main = new KthLargestElementinanArray();
        System.out.println(main.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }

}
