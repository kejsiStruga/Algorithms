package Adt.ds.doublylinkedlist;

/**
 *
 * The most useful out of all variations!!
 */
public class AppMain {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.displayForward();
        linkedList.displayBackward();
        linkedList.deleteFirst();
        linkedList.deleteLast();
//
        linkedList.deleteKey(6);

        linkedList.insertAfter(7,8);
        linkedList.insertBefore(3,9);
        linkedList.displayForward();
        linkedList.displayBackward();
    }
}
