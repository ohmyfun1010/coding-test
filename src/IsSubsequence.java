package org.src;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();

    }

    public static void main(String[] argc){
        IsSubsequence main = new IsSubsequence();
        System.out.println(main.isSubsequence("abc","ahbgdc"));
    }

}