package stampedlock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic lock...");
            a = 11;
            Thread.sleep(6000);
            if (lock.validate(stamp)) { // to check whether it has been modified or not based on version change
                // if not modified
                System.out.println("Updated a value successfully !!!");
            } else {
                System.out.println("rollback of work");
                a = 10;
            }
        } catch (Exception ex) {

        }
    }

    public void consumer() {
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
        try {
            System.out.println("performing work");
            a = 9;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            lock.unlock(stamp);
            System.out.println("write lock released by: " + Thread.currentThread().getName());
        }
    }
}
