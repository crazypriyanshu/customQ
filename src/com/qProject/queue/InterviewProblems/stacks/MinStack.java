package com.qProject.queue.InterviewProblems.stacks;

import java.util.Stack;

public class DesignMinStack {
    public class MinStack {
        public Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>(); // to maintain current min


        public static void push(int x) {
            // push the element to stack
            
        }

        public void pop() {
            // remove the top element, else return nothing is stack is empty
        }

        public int top() {
            // gets the top element in constant time, return -1 if the stack is empty
        }

        public int getMin() {
            // return -1 if the stack is empty, else the min element
        }
    }
    public static void main(String[] args) {

    }
}
