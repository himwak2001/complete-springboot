package Tester;

import shared_resource.JoinSharedResource;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("Main thread is started...");
        JoinSharedResource obj = new JoinSharedResource();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is acquiring the lock on produce method...");
            obj.produce();
        });

        t1.setDaemon(true); // thread 1 will get over as soon as user thread gets over
        t1.start();

        System.out.println("Main thread is over...");
    }
}
