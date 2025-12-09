package org.src;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;

        int start = nums[0];
        int end = nums[0];
        int cnt = 1;

        for(int i = 1;i<nums.length;i++){
            if(start+cnt!=nums[i]){
                if(cnt == 1){
                    result.add(String.valueOf(start));
                }else{
                    result.add(String.valueOf(start) + "->" + String.valueOf(end));
                }
                cnt = 1;
                start = nums[i];
                end = nums[i];
            }else{
                end = nums[i];
                cnt++;
            }
        }

        if(cnt == 1){
            result.add(String.valueOf(start));
        }else{
            result.add(String.valueOf(start) + "->" + String.valueOf(end));
        }

        return result;

    }

    public static void main(String[] argc){

        SummaryRanges main = new SummaryRanges();
        System.out.println(main.summaryRanges(new int[]{0,2,3,4,6,8,9}));

    }

}
