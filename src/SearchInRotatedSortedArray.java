package org.src;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // 왼쪽 절반이 정상적으로 정렬되어 있는 경우
            if (nums[left] <= nums[mid]) {
                // target이 이 정렬된 구간(left ~ mid) 안에 있는지 확인
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // 왼쪽으로 좁힘
                } else {
                    left = mid + 1;  // 오른쪽으로 이동
                }
            }
            // 오른쪽 절반이 정상적으로 정렬되어 있는 경우
            else {
                // target이 이 정렬된 구간(mid ~ right) 안에 있는지 확인
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // 오른쪽으로 좁힘
                } else {
                    right = mid - 1; // 왼쪽으로 이동
                }
            }
        }

        return -1;


    }
    public static void main(String[] argc){
        SearchInRotatedSortedArray main = new SearchInRotatedSortedArray();
        System.out.println(main.search(new int[]{1,3},0));
    }
}
