package org.src;

public class Pow {

    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0) {
            // n이 짝수이면: (x^(n/2)) * (x^(n/2))
            return half * half;
        } else {
            // n이 홀수이면: (x^(n/2)) * (x^(n/2)) * x
            return half * half * x;
        }
    }

    public static void main(String[] argc){
        Pow p = new Pow();
        System.out.println(p.myPow(2.00000,10));
    }

}
