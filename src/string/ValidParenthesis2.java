package string;

import java.util.Stack;

public class ValidParenthesis2 {
    public static void main(String[] args) {
        String input = "[]";

        boolean isValid = isValid(input);
        if(isValid)
            System.out.println("valid Parenthesis");
        else
            System.out.println("invalid parenthesis");
    }

    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();

        for(Character ch : input.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='{') {
                stack.push('}');
            }
            else if(ch=='['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.empty();
    }
}
