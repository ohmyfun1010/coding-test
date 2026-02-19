package org.src;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int s=0;
        int e=0;
        int sum = nums[0];
        int min = Integer.MAX_VALUE;

        while(s<=e){

            if(target <= sum){
                min = Math.min(min,e-s+1);
                if(s>=nums.length) break;
                sum = sum - nums[s];
                s++;
            }else {
                e++;
                if(e>=nums.length) break;
                sum = sum + nums[e];
            }


        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] argc){

        MinimumSizeSubarraySum main = new MinimumSizeSubarraySum();
        System.out.println(main.minSubArrayLen(11,new int[]{1,2,3,4,5}));

    }

}
