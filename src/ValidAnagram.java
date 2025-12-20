package org.src;

import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0;i<t.length();i++){
            int minus = sMap.getOrDefault(t.charAt(i),0) - 1;
            if(minus < 0){
                return false;
            }
            sMap.put(t.charAt(i),minus);
        }

        for(Map.Entry<Character,Integer> map : sMap.entrySet()){
            if(map.getValue() > 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] argc){

        ValidAnagram main = new ValidAnagram();
        System.out.println(main.isAnagram("ab","a"));

    }
}
