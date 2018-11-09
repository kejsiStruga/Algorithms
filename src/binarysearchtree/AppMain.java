package binarysearchtree;

public class AppMain {
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(10, "ten");
        tree.insert(12, "twelve");
        tree.insert(15, "fifteen");

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);

    }
}
