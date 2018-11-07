package Adt.ds.queue;

public class Queue {
    private int maxSize; // init container with a set number of slots!
    private long[] queueArray; // slots to the main data
    private int front; // the index pos for the element in the beginning of the line
    private int end; // the index pos for the element at the back of the line
    private int nrItems; // counter to maintain the number of items in the queue

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; // index pos of the first slot of the array
        end = -1; // no item to be considered as the last item!
        nrItems = 0;
    }

    public void insert(long item) {
        // If reached max size => overwrite (aka: circular queue)
        if(end == maxSize-1) {
            // make it point to the beginning of the line again!
            end=-1;
        }
        end++;
        queueArray[end] = item;
        nrItems++;
    }

    public long remove() { // remove item from the front of the queue
        long temp = queueArray[front];
        front++;

        if(front==maxSize) { // removed everything from the queue!!
            front = 0;
        }
        nrItems--;

        return temp;
    }

    public long peakFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nrItems == 0);
    }

    public boolean isFull() {
        return  (nrItems == maxSize);
    }

    public void view() {
        System.out.print("[");
        for (int i=0; i< queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }
}
