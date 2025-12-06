package org.src;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String stringX = String.valueOf(x);
        int endIndex = stringX.length()-1;

        for(int i = 0;i<stringX.length();i++){

            String start = stringX.substring(i,i+1);
            String end = stringX.substring(endIndex,endIndex+1);
            if(!start.equals(end)){
                return false;
            }
            endIndex--;
        }

        return true;

    }

    public static void main(String[] argc){

        PalindromeNumber main = new PalindromeNumber();
        System.out.println(main.isPalindrome(10));

    }

}
