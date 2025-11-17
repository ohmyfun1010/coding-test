package org.src;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr); // 정렬된 문자열이 키

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] argc){

        String[] input = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams ga = new GroupAnagrams();
        List<List<String>> output = ga.groupAnagrams(input);
        System.out.println(output);

    }

}
