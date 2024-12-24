package info.kinhho.basic;

public class ThreadWithRunMethod extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadWithRunMethod();
        t1.start();
    }
}
