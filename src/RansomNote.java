package org.src;

import java.util.Map;
import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<String,Integer> ransomMap = new HashMap<>();
        for(int i = 0;i<ransomNote.length();i++){
            String key = ransomNote.substring(i,i+1);
            ransomMap.put(key,ransomMap.getOrDefault(key,0)+1);
        }

        Map<String,Integer> magaMap = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            String key = magazine.substring(i,i+1);
            magaMap.put(key,magaMap.getOrDefault(key,0)+1);
        }

        for(Map.Entry<String,Integer> entry : magaMap.entrySet()){

            if(ransomMap.get(entry.getKey())!=null){
                ransomMap.put(entry.getKey(),ransomMap.get(entry.getKey())-entry.getValue());
            }

        }

        for(Map.Entry<String,Integer> entry : ransomMap.entrySet()){
            if(entry.getValue()>0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] argc){
        RansomNote main = new RansomNote();
        System.out.println(main.canConstruct("baawd","awdawb"));
    }

}
