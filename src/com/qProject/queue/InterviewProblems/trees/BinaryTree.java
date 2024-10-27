package com.qProject.queue.InterviewProblems.trees;

import com.qProject.queue.InterviewProblems.Node;
import com.qProject.queue.InterviewProblems.graphs.MaximumDepth;

public class BinaryTree {
    BinaryTreeNode root;
    
    public BinaryTreeNode addNode(BinaryTreeNode current, int val){
        // if the tree is empty, add it at curr position
        if (current == null){
            return new BinaryTreeNode(val);
        }
        // else traverse the tree
        if (val < current.val){
            current.left = addNode(current.left, val);
        } else if (val > current.val) {
            current.right = addNode(current.right, val);
        }
        return current;
    }
    
    public void add(int val){
        root = addNode(root, val);
    }

    // method to print binary tree in order
    public void inOrderTraversal(BinaryTreeNode node){
        if (node != null){
            inOrderTraversal(node.left);
            System.out.print(node.val+ " -> ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree treeNode = new BinaryTree();
        treeNode.add(50);
        treeNode.add(30);
        treeNode.add(70);
        treeNode.add(20);
        treeNode.add(40);
        treeNode.add(60);

        treeNode.inOrderTraversal(treeNode.root);

        SmallestKinBST smallestKinBST = new SmallestKinBST();
        System.out.println();
        System.out.println(smallestKinBST.kthSmallest(treeNode.root, 4));

        PathSum pathSum = new PathSum();
        int res = pathSum.hasPath(treeNode.root, 90);
        System.out.println(res);


    }
}
