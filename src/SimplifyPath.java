package org.src;

import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();

        for(int i = 1;i<path.length();i++){

            String c = String.valueOf(path.charAt(i));
            if(c.equals("/")){
                if(!builder.isEmpty() && !builder.toString().equals("..") && !builder.toString().equals(".")){
                    stack.push(builder.toString());
                    builder = new StringBuilder();
                }else if(builder.toString().equals("..") && !stack.isEmpty()){
                    stack.pop();
                    builder = new StringBuilder();
                }else{
                    builder = new StringBuilder();
                }
            }else{
                builder.append(c);
            }

        }

        if(!builder.isEmpty()){
            if(!builder.toString().equals("..") && !builder.toString().equals(".")){
                stack.push(builder.toString());
            }else if(builder.toString().equals("..") && !stack.isEmpty()){
                stack.pop();
            }
        }

        builder = new StringBuilder();
        builder.append("/");
        for(int i = 0;i<stack.size();i++){
            builder.append(stack.get(i));
            if(i<stack.size()-1){
                builder.append("/");
            }
        }

        return builder.toString();

    }

    public static void main(String[] argc){
        SimplifyPath main = new SimplifyPath();
        System.out.println(main.simplifyPath("/a//b////c/d//././/.."));
    }

}
