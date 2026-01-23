package org.src;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                switch (s) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }

    public static void main(String[] argc){
        EvaluateReversePolishNotation main = new EvaluateReversePolishNotation();
        System.out.println(main.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}
