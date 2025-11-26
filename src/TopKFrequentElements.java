package org.src;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> top2 = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .toList();

        int[] result = new int[k];

        for(int i = 0;i<top2.size();i++){
            result[i] = top2.get(i).getKey();
        }

        return result;

    }

    public static void main(String[] argc){
        TopKFrequentElements main = new TopKFrequentElements();
        main.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2},2);
    }

}
