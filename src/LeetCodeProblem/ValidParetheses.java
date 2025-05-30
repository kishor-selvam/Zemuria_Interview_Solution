package LeetCodeProblem;

import java.util.Stack;

public class ValidParetheses {
    public static void main(String[] args) {
//        String s = "()";
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if (ch == '(' && s.charAt(i) == ')' || ch == '[' && s.charAt(i) == ']' || ch == '{' && s.charAt(i) == '}') {

                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
