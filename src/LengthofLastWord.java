package org.src;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {

        int result = 0;

        for(int i = s.length()-1;i>=0;i--){
            if(s.substring(i,i+1).equals(" ")){
                if(result==0){
                    continue;
                }
                break;
            }else{
                result++;
            }
        }

        return result;

    }

    public static void main(String[] argc){
        LengthofLastWord main = new LengthofLastWord();
        System.out.println(main.lengthOfLastWord("A"));
    }

}
