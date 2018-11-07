package Adt.ds.singlylinkedlist;

public class SinglyLinkedList {
    // will utilize the Node class
    private Node first;

    // insert and remove data methods!

    // Resizable => advantageous compared to the array

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return first==null;
    }

    // used to insert at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    // Not efficient because all items are traversed!
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        Node temp = first;

        while (temp.next!=null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
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
