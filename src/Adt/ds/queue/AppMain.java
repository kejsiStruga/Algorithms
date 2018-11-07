package Adt.ds.queue;

public class AppMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(10);
        queue.insert(100);
        queue.insert(1);
        queue.insert(10);
        queue.insert(100);

        queue.view();
    }
}
