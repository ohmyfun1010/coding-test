package org.src;

public class FindtheIndexoftheFirstOccurrenceinaString {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] argc){
        FindtheIndexoftheFirstOccurrenceinaString main = new FindtheIndexoftheFirstOccurrenceinaString();
        System.out.println(main.strStr("leetcode","leeto"));
    }

}
