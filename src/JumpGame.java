package org.src;

public class JumpGame {
    public boolean canJump(int[] nums) {
        // 현재 내가 도달할 수 있는 가장 먼 인덱스
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // 현재 위치 i가 내가 도달할 수 있는 최대 거리보다 멀다면 실패
            if (i > maxReach) {
                return false;
            }

            // 현재 위치에서 점프했을 때의 거리와 기존 최대 거리를 비교하여 갱신
            maxReach = Math.max(maxReach, i + nums[i]);

            // 이미 마지막 인덱스에 도달 가능하다면 바로 true 반환 (최적화)
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
    public static void main(String[] argc){
        JumpGame main = new JumpGame();
        System.out.println(main.canJump(new int[]{2,1,2,1,4}));
    }
}
