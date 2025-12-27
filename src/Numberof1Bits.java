package org.src;

public class Numberof1Bits {

    public int hammingWeight(int n) {

        int result = 0;

        while(n>0){
            if(n%2==1) result++;
            n = n / 2;
        }

        return result;

    }

    public static void main(String[] argc){
        Numberof1Bits main = new Numberof1Bits();
        System.out.println(main.hammingWeight(2147483645));
    }

}
