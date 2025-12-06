package org.src;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] argc){
        PlusOne main = new PlusOne();
        System.out.println(main.plusOne(new int[]{7,7,9,9}));
    }

}
