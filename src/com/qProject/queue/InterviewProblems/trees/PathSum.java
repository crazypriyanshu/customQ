package com.qProject.queue.InterviewProblems.trees;

import com.qProject.queue.InterviewProblems.graphs.MaximumDepth;

public class PathSum {
    // Given a binary tree and a sum,
    // determine if the tree has a root-to-leaf path
    // such that adding up all the values along the path equals the given sum.

    public boolean sum(BinaryTreeNode A, int currSum, int reqSum){
        if (A == null){
            return false;
        }
        if (A.left == null && A.right == null){
            currSum += A.val;
            if (currSum == reqSum)
                return true;
            return false;
        }
        int anssum = currSum + A.val;
        return sum(A.left, anssum, reqSum) || sum(A.right, anssum, reqSum);
    }

    public int hasPath(BinaryTreeNode A, int B){
        boolean status = sum(A, 0, B);
        return status ? 1: 0;
    }
}
