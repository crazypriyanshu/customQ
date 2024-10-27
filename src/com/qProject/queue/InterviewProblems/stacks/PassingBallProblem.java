package com.qProject.queue.InterviewProblems.stacks;

import java.util.Stack;

//*
// There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 10^6.
//Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.
//There are two kinds of passes:
//1) ID - the player in possession of the ball passes the ball "forward" to the player with id = ID
//2) 0 - the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.
//In the second kind of pass "0" just means Back Pass.
//Return the ID of the player who currently possesses the ball.
// *//
public class PassingBallProblem {
    public static int solveBallPassingProblem(int A, int B, int[] C){
        Stack<Integer> stack = new Stack<>();
        stack.push(B);
        for (int i: C){
            if (i != 0){
                stack.push(i);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }


}
