package org.src;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        while (n != 1) {
            if (visited.contains(n)) {
                return false;
            }

            visited.add(n);
            n = getNextNumber(n);
        }

        return true;
    }

    private int getNextNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] argc){
        HappyNumber main = new HappyNumber();
        System.out.println(main.isHappy(19));
    }

}
