package Adt.ds.doublylinkedlist;

public class Node {
    public int data;
    public Node next = null; // recursive datatype
    public Node previous = null;

    public void displayNode() {
        System.out.println("{ "+ data +" }");
    }
}