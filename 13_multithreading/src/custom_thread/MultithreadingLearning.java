package custom_thread;

public class MultithreadingLearning implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}
