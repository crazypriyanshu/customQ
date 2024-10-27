package com.qProject.queue.InterviewProblems.stacks;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>(); // to maintain current min
    public MinStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>(); // to maintain current min
    }

    public void push(int x) {
        // push the element to stack
        stack1.push(x);
        if (stack2.isEmpty()== false){
            if (x < stack2.peek()){
                stack2.push(x);
            }
        }
    }

    public void pop() {
        // remove the top element, else return nothing is stack is empty
        if (!stack1.isEmpty()){
            int temp = stack1.pop();
            if (stack2.peek() == temp) {

                stack2.pop();
            }
        }
    }

    public int top() {
        // gets the top element in constant time, return -1 if the stack is empty
        if (stack1.isEmpty()){
            return -1;
        }
        else return stack1.peek();
    }

    public int getMin() {
        // return -1 if the stack is empty, else the min element
        if (stack2.isEmpty()){
            return -1;
        } else return stack2.peek();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(10);
        minStack.push(3);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}


