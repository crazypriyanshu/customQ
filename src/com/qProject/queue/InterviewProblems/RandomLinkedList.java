package com.qProject.queue.InterviewProblems;

public class RandomLinkedList {
    int val;
    RandomLinkedList next;
    RandomLinkedList random;

    public RandomLinkedList(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

//    public static RandomLinkedList copyAnyRandomList(RandomLinkedList head) {
//        if( head == null) return null;
//
//        // Step 1 : create a new node and place them next to original node
//        RandomLinkedList curr = head;
//        while (curr != null) {
//            RandomLinkedList newNode = new RandomLinkedList(curr.val);
//            newNode.next = curr.next;
//            curr.next = newNode;
//            curr = newNode.next;
//        }
//
//        // Step 2: Assign random pointers for the copied data
//        curr = head;
//        while (curr != null) {
//            if (curr.random == null) {
//                curr.next.random = curr.random.next;
//            }
//            curr = curr.next.next;
//        }
//
//        // Seperate the original List and copied list
//        curr = head;
//        RandomLinkedList newHead = head.next;
//        RandomLinkedList copy = newHead;
//
//        while (curr != null) {
//            curr.next = curr.next.next;
//
//            if (copy.next != null) {
//
//            }
//        }
//    }
}
