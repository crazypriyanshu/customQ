package com.qProject.queue.InterviewProblems;

public class LinkedList {
    public static Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        // if head is null, meaning we have reached to end of node, or LL is empty, point to this one
        if(head == null) {
            head = newNode;
            return;
        } else {
            // traverse through the last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // remove from list
    public void remove(int data) {
        if(head == null) {
            return;
        }

        // if the head data needs to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        // find the node before the one we want to remove
        Node temp = head;
        if (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        // if node is found bypass the node to be deleted
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        // traverse till the end and just keep exchanging the pointer direction
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node findMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merging 2 sorted link list
    public static Node mergeTwoSortedLL(Node l1, Node l2) {
        // i get the 2 linked list which are already sorted

        // to sort this i instantiate a dummy node and this is going to store my result, lets call ot current
        Node dummy = new Node(-1);
        Node current = dummy;

        // till any of the linked list is finished:
        while (l1 != null && l2 != null) {
            // determine which data is bigger, move the current pointing to smaller data data between both
            if (l1.data < l2.data) {
                // here left data is small, so current points to l1 and now lets increase l1 to next
                current.next = l1;
                l1 = l1.next;
            } else {
                // here right data is small, so current points to l2, and lets increase the l2 to next
                current.next = l2;
                l2 = l2.next;
            }
            // keep moving the current as well
            current = current.next;
        }

        // there may be a case, where any one of the linked list has ended, then just attach all the left part to current
        if(l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }
        return dummy.next;
    }

    public static Node removeDuplicateFromSortedLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
            // lets take a dummy node and 1 pointer prev
            Node dummy = new Node(-1);
            dummy.next = head;
            Node prev = dummy;

            while (head != null) {
                // if duplicates skip them : is presentNodeData == nextNodeData
                if (head.next != null && head.data == head.next.data) {
                    // till i have the data equal
                    while (head.next != null && head.data == head.next.data) {
                        // skip this head to next
                        head = head.next;
                    }

                    // skipping prev pointer as well
                    prev = prev.next;
                }
                else {
                    prev = prev.next;
                }
                head = head.next;
            }
            return dummy.next;
    }

    public static Node sortLinkedList(Node head) {
        if(head == null && head.next == null) {
            return head;
        }
        // Approach : we do divide an conquer => Merge sort
        // 1. divide LL in 2 half's :
        // 2. and sort divided parts
        // 3. merge the divided sorted linked lists

        Node middleNode = getMiddle(head);
        Node leftNode = head;
        Node rightNode = middleNode.next;
        // sort both the list
        leftNode = sortLinkedList(leftNode);
        rightNode = sortLinkedList(rightNode);

        return mergeTwoSortedLL(leftNode, rightNode);
    }

    public static Node getMiddle(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node getIntersectionNode(Node head1, Node head2) {
        // i need to find a node which is pointed by both the node in given 2 linked list

        // 1. determine the length of both the list
        // 2. advance the pointer of the longer list by diff in length
        // 3. traverse both the linked list until a common node is found

        int len1 = getLength(head1);
        int len2 = getLength(head2);

        // align the starting point by advancing
        if(len1 > len2) {
            head1 = advanceLLBy(head1, len1-len2);
        }
        else {
            head2 = advanceLLBy(head2, len2 - len1);
        }

        // now traverse list to find intersection
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;

    }
    private static int getLength(Node head) {
        int len = 0;
        while (head != null){
            head = head.next;
            len++;
        }
        return len;
    }

    private static Node advanceLLBy(Node head, int len) {
        while (head.next != null && len != 0) {
            head = head.next;
            len--;
        }
        return head;
    }

    public static void insertNodeAtPosition(int position, int value) {
        if(position > getLength(head)) {
            System.out.println(" position is greater than the length of linked list, so can't insert at this position");
        }
        Node nn = new Node(value);
        Node temp = head;

        if(position == 1) {
            nn.next = head;
            head = nn;
        } else {
            for (int i =1; i< position-1; i++) {
                temp = temp.next;
                // reached till the position value
            }
            // add the node here\
            nn.next = temp.next;
            temp.next = nn;
        }
    }

    public static void deleteANodeAtPosition(int position) {
        if(position > getLength(head)) {
            System.out.println(" position is greater than the length of linked list, so can't insert at this position");
        }
        if (position == 1) {
            // if position is 1, just move head to point to next
            head = head.next;
        } else {
            // if position is greater than 1, reach to the position first by using a temp variable
            Node temp = head;
            for(int i =0; i< position-1; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                // removing the node from here
                temp.next = temp.next.next;
            }
        }


    }

    // problem : input -> 2 linked list, where digits are stored in reverse order
    // each node is the linked list represents a digit, and we need to return sum as LL - in reverse order

    public static Node addNumbersOfTwoLL(Node llA, Node llB) {
        Node l1 = llA;
        Node l2 = llB;
        Node res = new Node(-1);

        int carry = 0;

        while(l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.data: 0;
            int y = (l2 != null) ? l2.data: 0;
            int sum = carry + x + y;
            carry = sum/10;
            append(sum%10);
            if(l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry > 0){
            append(carry);
        }
        return head;
    }
    public static void append(int data) {
        if (head == null){
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }
}
