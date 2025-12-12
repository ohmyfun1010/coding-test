package org.src;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int div = nums.length / 2;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > div) {
                return num;
            }
        }

        return 0;
    }

    public static void main(String[] argc){
        MajorityElement main = new MajorityElement();
        System.out.println(main.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}
