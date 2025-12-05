package org.src;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        Map<String, String> patternToWord = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0;i<pattern.length();i++){
            String patternChar  = pattern.substring(i,i+1);
            String currentWord = words[i];
            if(patternToWord.get(patternChar )==null){
                if(!usedWords.add(currentWord)){
                    return false;
                }
                patternToWord.put(patternChar ,currentWord);
            }else{
                String value = patternToWord.get(patternChar );
                if(!value.equals(currentWord)){
                    return false;
                }
            }

        }

        return true;

    }

    public static void main(String[] argc){
        WordPattern main = new WordPattern();
        System.out.println(main.wordPattern("aaaa","dog dog dog dog"));
    }

}
