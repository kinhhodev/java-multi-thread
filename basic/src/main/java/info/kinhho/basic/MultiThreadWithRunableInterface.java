package info.kinhho.basic;

public class MultiThreadWithRunableInterface implements Runnable {

    private String threadName;
    private Thread thread;

    public MultiThreadWithRunableInterface(String threadName) {
        this.threadName = threadName;
        System.out.println("Create " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        }
        catch(InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public static void main(String[] args) {

        System.out.println("Main thread running... ");

        MultiThreadWithRunableInterface multiThreadWithRunableInterface1 = new MultiThreadWithRunableInterface("Thread-1");
        MultiThreadWithRunableInterface multiThreadWithRunableInterface2 = new MultiThreadWithRunableInterface("Thread-2");
        multiThreadWithRunableInterface1.start();
        multiThreadWithRunableInterface2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
