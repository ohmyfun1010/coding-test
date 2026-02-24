package org.src;

import java.util.*;


public class FindKPairswithSmallestSums {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        // 합이 작은 순서대로 정렬하는 최소 힙 (Min Heap)
        // int[] 구성: {nums1의 값, nums2의 값, nums2의 인덱스}
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        List<List<Integer>> result = new ArrayList<>();

        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        // 1. 초기값 세팅: nums1의 모든 요소와 nums2[0]의 쌍을 힙에 넣음 (최대 k개까지만)
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }

        // 2. K번 추출하며 다음 후보 삽입
        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            result.add(Arrays.asList(current[0], current[1]));

            // 현재 꺼낸 쌍이 nums1[i]와 nums2[j]라면,
            // 다음 후보인 nums1[i]와 nums2[j+1]을 힙에 넣음
            int nextIdx2 = current[2] + 1;
            if (nextIdx2 < nums2.length) {
                minHeap.offer(new int[]{current[0], nums2[nextIdx2], nextIdx2});
            }
        }

        return result;

    }

    public static void main(String[] argc){

        FindKPairswithSmallestSums main = new FindKPairswithSmallestSums();
        System.out.println(main.kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},3));

    }

}
