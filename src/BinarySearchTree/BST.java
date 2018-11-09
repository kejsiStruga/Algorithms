package BinarySearchTree;

public class BST {

    private Node root;

    public void insert(int key, String value) {

        Node newNode = new Node(key, value);

        if(root==null) {
            root = newNode;
        } else {
            // properly insert in the BST
            Node current = root;
            Node parent;

            while(true) {
                parent = current;
                if(key < current.key) {
                    current = current.leftChild;
                    if(current == null) { // Its parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                       parent.rightChild = newNode;
                       return;
                    }
                }

            }
        }
    }

    public void insert(Node node) {
        if(root==null) {
            root = node;
        } else {
            // properly insert in the BST
            Node current = root;
            Node parent;

            while(true) {
                parent = current;
                if(node.key < current.key) {
                    current = current.leftChild;
                    if(current == null) { // Its parent is the leaf node
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }

            }
        }
    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public int findParent(Node node) {
        Node current = root;

        if(current == node) return -1;

        while(current!=null) {
            if (node == current.leftChild || node == current.rightChild) {
                return current.key;
            } else {
                if (node.key < current.key) {
                    current = current.leftChild;
                } else {
                    current = current.rightChild;
                }
            }
        }

        if(current==null) {
            System.out.println("This node is not part of the tree!");
            return -1;
        }

        return current.key;
    }

    public boolean isLeaf(Node node) {
        if(node.leftChild == null && node.rightChild == null) {
            return true;
        }
        return false;
    }

    public Node findNode(int key) {
        Node current = root;

        while (current != null) {
            if(key > current.key) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
            if(current.key == key) {
                return current;
            }
        }
        return null;
    }

    public boolean removeBykey(int key) {
        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        // Searching to find the node with the key to delete
        while (currentNode.key != key) {
            parentNode = currentNode;
            if(key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if(currentNode == null) {
                return false;
            }
        }

        // found the node that we're trying to delete
        Node nodeToDelete = currentNode;

        // is a leaf
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
            // set parent's child to null
            if(nodeToDelete == root) root = null;
            else if(isLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
            // has 1 child
            // if node has one child that is on the left
        } else if(nodeToDelete.rightChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if(isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        } else if(nodeToDelete.leftChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if(isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
            // has 2 children
        } else {
            Node successor = getSuccessor(nodeToDelete);

            // connect parent of nodeToDelete to successor instead
            if(nodeToDelete == root) {
                root = successor;
            } else if(isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }

            successor.leftChild = nodeToDelete.leftChild;
        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;

        Node current = nodeToDelete.rightChild; // go to the right child

        while (current!=null) { // start going left down the tree until node has no left children
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        // if successor not a right child;
        if(successor != nodeToDelete.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = nodeToDelete.rightChild;
        }

        return successor;
    }
}
