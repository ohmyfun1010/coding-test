package org.src;

public class JumpGame2 {

    public int jump(int[] nums) {

        //지금까지 점프 횟수
        int jumps = 0;

        //현재 점프로 도달 가능한 최대 인덱스
        int currentEnd = 0;

        //다음 점프로 도달 가능한 최대 인덱스
        int farthest = 0;

        // 마지막 인덱스 전까지만 보면 된다
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // 현재 점프 범위의 끝에 도달했을 때
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] argc){
        JumpGame2 main = new JumpGame2();
        main.jump(new int[]{2,1,1,1,1});
    }

}
