package readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(() -> {
            resource.producer(lock);
        });

        Thread thread2 = new Thread(() -> {
            resource.producer(lock);
        });

        SharedResource resource1 = new SharedResource();
        Thread thread3 = new Thread(() -> {
            resource1.consumer(lock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
