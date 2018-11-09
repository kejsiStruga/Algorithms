package heap;

public class Heap {
    private Node[] heapArray;
    private int maxSize; // size of the array
    private int currentSize; // number of nodes in the array

    public Heap(int size) {
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size]; // actually creates the array
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize==0;
    }

    public boolean insert(int key) {
        if(currentSize == maxSize) { // array is full
            return false;
        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleUp(currentSize);

        currentSize++;

        return true;
    }

    private void trickleUp(int idx) {
        int parentIdx = (idx -1)/2;
        Node nodeToInsert = heapArray[idx];

        // loop as long as we haven't reached the root
        // and key of nodeToInsert's parent is less than new node
        while (idx>0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
            heapArray[idx] = heapArray[parentIdx]; // move the parent down
            idx = parentIdx;
            parentIdx = (parentIdx-1)/2; // move up
        }
        heapArray[idx] = nodeToInsert;
    }
}
