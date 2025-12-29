package org.src;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ReverseWordsinaString {

    public String reverseWords(String s) {
        String trimmedInput = s.trim();
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < trimmedInput.length(); i++) {
            String currentChar = trimmedInput.substring(i, i + 1);

            if (currentChar.equals(" ") && !currentWord.isEmpty()) {
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            } else if (!currentChar.equals(" ")) {
                currentWord.append(currentChar);
            }
        }

        if (!currentWord.isEmpty()) {
            words.add(currentWord.toString());
        }

        Collections.reverse(words);

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(word).append(" ");
        }

        String result = reversedSentence.toString();
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] argc){
        ReverseWordsinaString main = new ReverseWordsinaString();
        System.out.println(main.reverseWords("the sky is blue"));
    }

}
