package org.src;

import java.util.Map;
import java.util.HashMap;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i])){
                int index = hashMap.get(nums[i]);
                if((index - i) * -1 <=k){
                    return true;
                }else{
                    hashMap.put(nums[i],i);
                }
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] argc){
        ContainsDuplicateII main = new ContainsDuplicateII();
        System.out.println(main.containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }

}
