class Threading implements Runnable {
    private String threadName;

    Threading( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
}

class TestThread {

    public static void main(String[] args) {
        Threading r1 = new Threading( "Thread-1");
        r1.run();

        Threading r2 = new Threading( "Thread-2");
        r2.run();
    }
}