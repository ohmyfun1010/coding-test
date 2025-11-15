package org.src;

import java.util.Map;
import java.util.LinkedHashMap;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        Map<String,Integer> symbol = new LinkedHashMap<>();
        symbol.put("M",1000);
        symbol.put("CM",900);
        symbol.put("D",500);
        symbol.put("CD",400);
        symbol.put("C",100);
        symbol.put("XC",90);
        symbol.put("L",50);
        symbol.put("XL",40);
        symbol.put("X",10);
        symbol.put("IX",9);
        symbol.put("V",5);
        symbol.put("IV",4);
        symbol.put("I",1);

        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, Integer> entry : symbol.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            int div = num/value;
            num = num - (div * value);
            for(int i = 0;i<div;i++){
                builder.append(key);
            }
        }

        return String.valueOf(builder);
    }

    public static void main(String[] argc){
        String result = IntegerToRoman.intToRoman(3749);
        System.out.println(result);
    }

}
