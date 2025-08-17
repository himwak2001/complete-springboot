package custom_thread;

public class MultithreadingLearning2 extends Thread {
    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}
