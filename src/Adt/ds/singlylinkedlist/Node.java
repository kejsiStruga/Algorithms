package Adt.ds.singlylinkedlist;

public class Node {
    public int data;
    public Node next = null; // recursive datatype

    public void displayNode() {
        System.out.println("{ "+ data +" }");
    }
}
