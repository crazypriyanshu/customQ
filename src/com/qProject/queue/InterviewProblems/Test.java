package com.qProject.queue.InterviewProblems;

public class Test {
    static int x = 10;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);

        LinkedList.printList();
        ll.reverse();
        LinkedList.printList();
    }
}
