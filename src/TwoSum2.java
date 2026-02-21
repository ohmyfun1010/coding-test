package org.src;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // 합이 작으니 더 큰 숫자가 있는 오른쪽으로
            } else {
                right--; // 합이 크니 더 작은 숫자가 있는 왼쪽으로
            }
        }
        return new int[]{-1, -1};

    }

    public static void main(String[] argc){
        TwoSum2 main = new TwoSum2();
        System.out.println(main.twoSum(new int[]{2,7,11,15},9));
    }

}
