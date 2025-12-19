package org.src;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer,Integer> hash = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hash.put(nums[i],i);
        }

        for(int i = 0;i<nums.length;i++){
            int remain = target - nums[i];
            if(hash.get(remain)!=null && i != hash.get(remain)){
                result[0] = i;
                result[1] = hash.get(remain);
                break;
            }
        }

        return result;

    }

    public static void main(String[] argc){
        TwoSum main = new TwoSum();
        main.twoSum(new int[]{3,3},6);
    }

}
