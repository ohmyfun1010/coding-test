package org.src;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k = 0;  // val이 아닌 값을 넣을 위치

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }

    public static void main(String[] argc){
        RemoveElement main = new RemoveElement();
        main.removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }

}
