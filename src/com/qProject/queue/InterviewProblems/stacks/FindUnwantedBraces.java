package com.qProject.queue.InterviewProblems.stacks;

import java.util.Stack;

public class FindUnwantedBraces {
    public static int findUnwantedBraces(String A){
        Stack<Character> stack = new Stack<>();
        for (Character c: A.toCharArray()){
            if (c == '(' || c == '+' || c == '-' || c == '*' || c == '/' ){
                stack.push(c);
            }
            if (c == ')'){
                if (stack.peek() == '('){
                    return 1;
                } else {
                    while (stack.peek() != '('){
                        stack.pop();
                    }

                }
                stack.pop();
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        String A = "((a+b))";
        System.out.println(findUnwantedBraces(A));
    }
}
