package Adt.ds.circularlinkedlist;

import Adt.ds.singlylinkedlist.Node;


/**
 *
 * CircularLinkedList is more efficient
 * to insert/delete things at both ends,
 * since we have two references;
 *
 */
public class CircularLinkedList {

        private Node first;
        private Node last;

        public CircularLinkedList() {
            first = null;
            last = null;
        }

        public boolean isEmpty() {
            return first==last;
        }

        // used to insert at the beginning of the list
        public void insertFirst(int data) {
            Node newNode = new Node();
            newNode.data = data;

            if (isEmpty()) {
                last = newNode;
            }

            newNode.next = first;
            first = newNode;
        }

//        // Not efficient because all items are traversed!
        public void insertLast(int data) {
            Node newNode = new Node();
            newNode.data = data;

            if (isEmpty()) {
                first = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }

        public int deleteFirst() {
            int temp = first.data;

            if (first.next==null) {
                last = null;
            }
            first = first.next;
            return temp;
        }

        @SuppressWarnings("Duplicates")
        public void displayList() {
            System.out.println("List (first ---> last)");

            Node current = first;

            while(current!=null) {
                current.displayNode();
                current = current.next;
            }
            System.out.println(" ");
        }

}
