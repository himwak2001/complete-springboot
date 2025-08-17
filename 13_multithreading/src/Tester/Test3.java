package Tester;

import shared_resource.MonitorLockExample;

public class Test3 {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(obj::task1);
        Thread t2 = new Thread(obj::task2);
        Thread t3 = new Thread(obj::task3);
        t1.start(); // 1. synchronized -> acquire lock on obj -> wait for 10 seconds -> 4. after 10 sec, lock is released
        t2.start(); // 2. already locked -> wait for t1 to release lock -> 5. synchronized -> acquire lock
        t3.start(); // 3. no synchronized -> no need to wait for lock to be released
    }
}
