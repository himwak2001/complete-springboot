package reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock) {
        try {
            lock.lock(); // acquire the lock
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock(); // release the acquire lock
            System.out.println("Lock release by: " + Thread.currentThread().getName());
        }
    }
}
