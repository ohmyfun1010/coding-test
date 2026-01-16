package org.src;

import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int maxLen = 0;

        for (int n : set) {
            // n-1 이 없으면 n은 연속 수열의 시작점
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;

    }

    public static void main(String[] argc){
        LongestConsecutiveSequence main = new LongestConsecutiveSequence();
        main.longestConsecutive(new int[]{100,4,200,1,3,2});
    }

}
