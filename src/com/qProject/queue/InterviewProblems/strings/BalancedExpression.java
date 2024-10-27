package com.qProject.queue.InterviewProblems.strings;

import java.util.Stack;

public class BalancedExpression {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']' ) {
                if (!stack.empty() &&
                        ((stack.peek() == '(' && s.charAt(i) == ')') ||
                        (stack.peek() == '{' && s.charAt(i) == '}') ||
                        (stack.peek() == '[' && s.charAt(i) == ']'))){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String s = "{()}l[]";
        System.out.println(isBalanced(s));
    }
}
