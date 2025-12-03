package org.src;

import java.util.Map;
import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] argc){
        RansomNote main = new RansomNote();
        System.out.println(main.canConstruct("a","b"));
    }

}
