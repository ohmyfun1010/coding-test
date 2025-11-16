package org.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        // 여는 괄호 추가
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // 닫는 괄호 추가
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParenthesis(3));
    }

}
