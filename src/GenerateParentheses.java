package org.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public void dfs(List<String> list,int l,int s,int e,String sb,int n){

        if(l>n*2){
            sb = sb.substring(0,sb.length()-1);
            return;
        }

        if(l==n*2){
            if(s==e){
                list.add(String.valueOf(sb));
            }else{
                sb = sb.substring(0,sb.length()-1);
            }
            return;
        }

        if(s > n){
            sb = sb.substring(0,sb.length()-1);
            return;
        }

        if(e > n){
            sb = sb.substring(0,sb.length()-1);
            return;
        }

        dfs(list,l+1,s+1,e,sb + "(",n);
        dfs(list,l+1,s,e+1,sb + ")",n);

    }

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        dfs(list,1,1,0,"(",n);

        if(!list.isEmpty()){

            for(String s : list){

                Stack<String> stack = new Stack<>();

                for(int i = 0;i<s.length();i++){

                    String target = s.substring(i,i+1);

                    if(i==0){
                        if(target.equals(")")){
                            break;
                        }
                    }

                    if(target.equals(")")){
                        if(!stack.isEmpty() && stack.peek().equals("(")){
                            stack.pop();
                        }
                    }else{
                        stack.add(target);
                    }

                }

                if(stack.isEmpty()){
                    answer.add(s);
                }

            }

        }

        return answer;
    }

    public static void main(String[] argc){

        GenerateParentheses gp = new GenerateParentheses();
        List<String> result = gp.generateParenthesis(3);
        System.out.println("aa");

    }

}
