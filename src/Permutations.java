package org.src;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] visited) {
        // 1. 종료 조건: 숫자를 다 골랐을 때
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // 복사본 저장
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 2. 가지치기: 이미 고른 숫자면 건너뜀
            if (visited[i]) continue;

            // 3. 선택
            visited[i] = true;
            tempList.add(nums[i]);

            // 4. 다음 단계로 이동
            backtrack(result, tempList, nums, visited);

            // 5. 백트래킹 (상태 복구)
            visited[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);

        System.out.println(result);
    }

}
