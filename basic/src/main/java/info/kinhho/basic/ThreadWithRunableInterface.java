package info.kinhho.basic;

public class ThreadWithRunableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadWithRunableInterface());
        t1.start();
    }
}
