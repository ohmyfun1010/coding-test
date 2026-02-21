package org.src;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {

        int sum = 0;

        for(int i = 0;i<numbers.length;i++){

            for(int j = i+1;j<numbers.length;j++){
                sum = numbers[i] + numbers[j];
                if(sum==target){
                    return new int[]{i+1,j+1};
                }
            }

            sum = 0;

        }

        return new int[]{0,0};

    }

    public static void main(String[] argc){
        TwoSum2 main = new TwoSum2();
        System.out.println(main.twoSum(new int[]{2,7,11,15},9));
    }

}
