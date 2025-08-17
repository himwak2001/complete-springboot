package Tester;

import custom_thread.MultithreadingLearning;
import custom_thread.MultithreadingLearning2;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("In the main method: " + Thread.currentThread().getName());
        MultithreadingLearning2 myThread = new MultithreadingLearning2();
        myThread.start(); // start the thread : internally call run method -> invoke run() --> target.run() i.e., runnableObj.run()
        System.out.println("Main method over: " + Thread.currentThread().getName());
    }
}

// Execution --> main thread -->
