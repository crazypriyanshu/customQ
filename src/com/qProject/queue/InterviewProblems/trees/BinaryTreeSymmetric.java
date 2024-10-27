package com.qProject.queue.InterviewProblems.trees;

import com.qProject.queue.InterviewProblems.graphs.MaximumDepth;

public class BinaryTreeSymmetric {
    // verify if the binary tree is symetric

    public int isSymmetric(BinaryTreeNode A){
        if(A == null){
            return 0;
        }
        return rec(A.left, A.right)? 1 : 0;
    }

    public boolean rec(BinaryTreeNode node1, BinaryTreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if (node1 == null || node2 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        return rec(node1.left, node2.right) & rec(node1.right, node2.left);
    }
}
