package org.src;

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;
        // n을 5로 계속 나누면서 5의 배수, 25의 배수...의 개수를 더함
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] argc){
        FactorialTrailingZeroes main = new FactorialTrailingZeroes();
        System.out.println(main.trailingZeroes(30));
    }

}
