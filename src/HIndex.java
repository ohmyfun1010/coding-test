package org.src;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {

        int max = 0;
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {

            System.out.println(citations[i]);
            System.out.println(n-i);

            int h = Math.min(citations[i], n - i);
            max = Math.max(max, h);
        }

        return max;

    }

    public static void main(String[] argc){
        HIndex main = new HIndex();
        System.out.println(main.hIndex(new int[]{4,3,5,5,5}));
    }

}
