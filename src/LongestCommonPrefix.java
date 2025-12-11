package org.src;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            String currentChar = "";
            int matchCount = 0;

            for (int j = 0; j < strs.length; j++) {
                if (currentChar.isEmpty()) {
                    currentChar = strs[j].substring(i, i + 1);
                    matchCount++;
                } else if (currentChar.equals(strs[j].substring(i, i + 1))) {
                    matchCount++;
                }
            }

            if (strs.length == matchCount) {
                prefix.append(currentChar);
            } else {
                return prefix.toString();
            }
        }

        return prefix.toString();

    }

    public static void main(String[] argc){
        LongestCommonPrefix main = new LongestCommonPrefix();
        System.out.println(main.longestCommonPrefix(new String[]{"cir","car"}));
    }

}
