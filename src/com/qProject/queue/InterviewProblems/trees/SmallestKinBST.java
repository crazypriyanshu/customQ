package com.qProject.queue.InterviewProblems.trees;

import java.util.PriorityQueue;

public class SmallestKinBST {
    int count = 0, result =0;
    void inOrder(BinaryTreeNode A,  int B){
        if (A == null){
            return;
        }
        inOrder(A.left, B);
        count++;
        if (count == B){
            result = A.val;
            return;
        }
        inOrder(A.right, B);

    }

    public int kthSmallest(BinaryTreeNode A, int B){

        count = 0;
        result = -1;
        inOrder(A, B);
        return result;
    }



    public static void main(String[] args) {

    }
}
