package org.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SingleNumberII {

    public int singleNumber(int[] nums) {

        List<Integer> blackList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i]) && !blackList.contains(nums[i])){
                set.remove(nums[i]);
                blackList.add(nums[i]);
            }else if(!set.contains(nums[i]) && !blackList.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        return set.iterator().next();

    }

    public static void main(String[] argc){

        SingleNumberII main = new SingleNumberII();
        System.out.println(main.singleNumber(new int[]{0,1,0,1,0,1,99}));

    }

}
