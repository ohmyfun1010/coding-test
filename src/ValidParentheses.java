package org.src;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            String item = s.substring(i,i+1);
            if(!stack.isEmpty()){
                if(stack.peek().equals("(") && item.equals(")")){
                    stack.pop();
                    continue;
                }else if(stack.peek().equals("{") && item.equals("}")){
                    stack.pop();
                    continue;
                }else if(stack.peek().equals("[") && item.equals("]")){
                    stack.pop();
                    continue;
                }
            }
            stack.push(item);
        }

        return stack.isEmpty();

    }

    public static void main(String[] argc){
        ValidParentheses main = new ValidParentheses();
        System.out.println(main.isValid("([)]"));

    }

}
