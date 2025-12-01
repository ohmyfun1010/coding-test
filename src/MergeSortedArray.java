package org.src;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;         // nums1의 실제 값 마지막 인덱스
        int p2 = n - 1;         // nums2의 마지막 인덱스
        int p = m + n - 1;      // nums1의 전체 마지막 인덱스(채워 넣을 위치)

        // 둘 다 남아있는 동안 큰 값부터 nums1 뒤에서 채운다
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // nums2가 남아 있다면 그대로 채워야 한다
        // nums1은 이미 이미 정렬되어 있으므로 nums1 쪽은 처리할 필요 없음
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

    }

    public static void main(String[] argc){
        MergeSortedArray main = new MergeSortedArray();
//        main.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
//        main.merge(new int[]{4,0,0,0,0,0},1,new int[]{1,2,3,5,6},5);
//        main.merge(new int[]{0},0,new int[]{1},1);
    }

}
