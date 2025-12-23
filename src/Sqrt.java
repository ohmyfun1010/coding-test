package org.src;

public class Sqrt {

    public int mySqrt(int x) {

        if (x < 2) return x;

        int left = 1;
        int right = x;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                answer = mid;      // 정답 후보 저장
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;

    }

    public static void main(String[] argc){
        Sqrt main = new Sqrt();
        System.out.println(main.mySqrt(9));
    }

}
