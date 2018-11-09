package BinarySearchTree;

public class AppMain {
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(10, "ten");
        tree.insert(12, "twelve");

        Node node0 = new Node(15, "fifteen");
        Node node = new Node(13, "thirteen");
        Node node1 = new Node(16, "sixteen");

        tree.insert(node0);
        tree.insert(node);
        tree.insert(node1);

        tree.removeBykey(10);
        System.out.println(tree.findMin().key);
    }
}
