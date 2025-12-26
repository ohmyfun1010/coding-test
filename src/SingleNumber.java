package org.src;

import java.util.Map;
import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Map<Integer,Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> map : hash.entrySet()){
            if(map.getValue()==1){
                return map.getKey();
            }
        }

        return 0;

    }

    public static void main(String[] argc){
        SingleNumber main = new SingleNumber();
        System.out.println(main.singleNumber(new int[]{1}));
    }

}
