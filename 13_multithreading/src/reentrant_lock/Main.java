package reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> {
            resource.producer(lock); // supply the same lock
        });

        SharedResource resource2 = new SharedResource();
        Thread t2 = new Thread(() -> {
            resource2.producer(lock); // supply the same lock
        });

        t1.start();
        t2.start();
    }
}
