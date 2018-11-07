package Adt.ds.singlylinkedlist;

public class AppMain {

    public static int listLength(Node aNode) {
        Node n = aNode;
        int nrNodes = 0;

        while (n.next != null) {
            nrNodes++;
            n = n.next;
        }
        return nrNodes+1; // +1, to count the node passed as param
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
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
