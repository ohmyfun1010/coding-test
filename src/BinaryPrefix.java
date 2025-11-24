package org.src;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefix {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int mod = 0;

        for (int bit : nums) {
            mod = (mod * 2 + bit) % 5;
            result.add(mod == 0);
        }

        return result;
    }

    public static void main(String[] argc){
        BinaryPrefix main = new BinaryPrefix();
        List<Boolean> result = main.prefixesDivBy5(new int[]{0,1,1});
        System.out.println(result);
    }

}
