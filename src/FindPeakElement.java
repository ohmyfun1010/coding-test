package org.src;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // 올라가는 방향이므로 오른쪽 탐색
                left = mid + 1;
            } else {
                // 내려가는 방향이므로 현재 mid를 포함해 왼쪽 탐색
                right = mid;
            }
        }
        // left와 right가 만나는 지점이 피크
        return left;

    }
    public static void main(String[] argc){
        FindPeakElement main = new FindPeakElement();
        System.out.println(main.findPeakElement(new int[]{1,2,1,3,5,6,7}));
    }
}
