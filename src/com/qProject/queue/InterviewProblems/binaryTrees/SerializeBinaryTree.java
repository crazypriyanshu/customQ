package com.qProject.queue.InterviewProblems.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            val = val;
            left = null;
            right = null;
        }

    }

    public ArrayList<Integer> serializeBinaryTree(TreeNode A){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while (!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i< len; i++){
                TreeNode temp = q.remove();
                if(temp == null){
                    ans.add(-1);
                } else {
                    ans.add(temp.val);
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.left == null){
                        q.add(null);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                    if(temp.right == null){
                        q.add(null);
                    }
                }
            }
        }
        return ans;
    }
}
