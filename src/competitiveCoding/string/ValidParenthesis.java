package competitiveCoding.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "){";
        char[] inputChar = input.toCharArray();

        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');

        Stack<Character> stack = new Stack<>();
        stack.push(inputChar[0]);
        for (int i = 1; i < inputChar.length; i++) {
            if (stack.empty() || hashMap.get(stack.peek()) ==null || (hashMap.get(stack.peek()) !=null && hashMap.get(stack.peek())!= input.charAt(i)))
                stack.push(input.charAt(i));
            else {
                stack.pop();
            }
        }
        if (stack.size() == 0) {
            System.out.println("Valid Paraenthesis");
        } else {
            System.out.println("invalid Parenthesis");
        }
    }
}