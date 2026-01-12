package org.src;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 현재 두 포인터 사이의 너비 계산
            int width = right - left;

            // 두 막대 중 더 낮은 높이 결정
            int minHeight = Math.min(height[left], height[right]);

            // 최댓값 업데이트
            maxArea = Math.max(maxArea, width * minHeight);

            // 더 낮은 막대기를 안쪽으로 이동 (더 높은 막대를 찾아야 넓이가 커질 가능성이 있음)
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }

    public static void main(String[] argc){
        ContainerWithMostWater main = new ContainerWithMostWater();
        System.out.println(main.maxArea(new int[]{1,1}));
    }

}
