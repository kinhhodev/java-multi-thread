package info.kinhho;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());

        ThreadSimple threadSimple1 = new ThreadSimple("Luồng 1");
        ThreadSimple threadSimple2 = new ThreadSimple("Luồng 2");
        ThreadSimple threadSimple3 = new ThreadSimple("Luồng 3");

        threadSimple1.setPriority(1);
        threadSimple2.setPriority(5);
        threadSimple3.setPriority(10);

        threadSimple1.start();
        threadSimple2.start();
        threadSimple3.start();
    }
}

class ThreadSimple extends Thread {

    public ThreadSimple(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
        }
    }
}