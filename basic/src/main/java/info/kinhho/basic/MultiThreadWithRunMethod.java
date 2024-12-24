package info.kinhho.basic;

public class MultiThreadWithRunMethod extends Thread {

    private String threadName;
    private Thread thread;

    public MultiThreadWithRunMethod(String threadName) {
        this.threadName = threadName;
        System.out.println("Create " + threadName);
    }
    @Override
    public void run() {
        super.run();

        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
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

        MultiThreadWithRunMethod multiThreadWithRunMethod1 = new MultiThreadWithRunMethod("Thread-1");
        multiThreadWithRunMethod1.start();
        MultiThreadWithRunMethod multiThreadWithRunMethod2 = new MultiThreadWithRunMethod("Thread-2");
        multiThreadWithRunMethod2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
