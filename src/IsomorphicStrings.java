package org.src;

import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        int[] sPatternIndices = new int[s.length()];
        int[] tPatternIndices = new int[t.length()];

        Map<String,Integer> sMap = new HashMap<>();
        Map<String,Integer> tMap = new HashMap<>();

        int nextUniqueIndex = 0;
        for(int i = 0;i<s.length();i++){
            String c = s.substring(i,i+1);
            if(sMap.getOrDefault(c,-1) == -1){
                sMap.put(c,nextUniqueIndex);
                sPatternIndices[i] = nextUniqueIndex;
                nextUniqueIndex++;
            }else{
                int assignedIndex = sMap.get(c);
                sPatternIndices[i] = assignedIndex;
            }
        }

        nextUniqueIndex = 0;
        for(int i = 0;i<t.length();i++){
            String c = t.substring(i,i+1);
            if(tMap.getOrDefault(c,-1) == -1){
                tMap.put(c,nextUniqueIndex);
                tPatternIndices[i] = nextUniqueIndex;
                nextUniqueIndex++;
            }else{
                int assignedIndex = tMap.get(c);
                tPatternIndices[i] = assignedIndex;
            }
            if(sPatternIndices[i]!=tPatternIndices[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] argc){
        IsomorphicStrings main = new IsomorphicStrings();
        System.out.println(main.isIsomorphic("egg","add"));
    }

}
