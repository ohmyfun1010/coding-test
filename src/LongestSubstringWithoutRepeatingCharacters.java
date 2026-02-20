package org.src;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) return 0;

        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0; // 윈도우의 시작점

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            max = Math.max(max, right - left + 1);
        }

        return max;

    }

    public static void main(String[] argc){
        LongestSubstringWithoutRepeatingCharacters main = new LongestSubstringWithoutRepeatingCharacters();
//        System.out.println(main.lengthOfLongestSubstring("dvdf"));
        System.out.println(main.lengthOfLongestSubstring("dvdf"));
    }

}
