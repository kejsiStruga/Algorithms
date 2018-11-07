package Adt.ds.circularlinkedlist;

import Adt.ds.singlylinkedlist.Node;
import Adt.ds.singlylinkedlist.SinglyLinkedList;

public class AppMain {

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(10);
        list.insertFirst(100);

        // From last to first
        list.displayList();

        list.insertLast(99);
        list.displayList();

//        Node a = new Node();
//        a.data = 4;
//
//        Node b = new Node();
//        b.data = 3;
//
//        Node c = new Node();
//        c.data = 7;
//
//        Node d = new Node();
//        d.data = 8;
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
//
//        System.out.println(AppMain.listLength(b));
    }
}
