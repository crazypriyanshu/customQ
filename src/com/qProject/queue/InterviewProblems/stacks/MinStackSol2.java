package com.qProject.queue.InterviewProblems.stacks;

import com.qProject.queue.InterviewProblems.LinkedList;

import java.util.Stack;

public class MinStackSol2 {
    ListNode head = null;
    Stack<Integer> trackMin = new Stack<>();
    int size = 0;
    int min = Integer.MAX_VALUE;

    public void push(int x){
        if (x <= min){
            trackMin.push(x);
            min = x;
        }
        ListNode node = new ListNode(x);
        if (head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void pop(){
        if (size > 0){
            if (head.val == trackMin.peek()){
                trackMin.pop();
                if (!trackMin.isEmpty()){
                    min = trackMin.peek();
                } else {
                    min = Integer.MAX_VALUE;
                }
            }
            head = head.next;
            size--;
        }
    }

    public int top(){
        if (size == 0){
            return -1;
        }
        return head.val;
    }

    public int getMin(){
        if (size == 0){
            return -1;
        }
        return min;
    }
}
