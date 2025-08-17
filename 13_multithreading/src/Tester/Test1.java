package Tester;

import custom_thread.MultithreadingLearning;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("In the main method: " + Thread.currentThread().getName());
        MultithreadingLearning runnableObj = new MultithreadingLearning(); // create instance of the class
        Thread thread = new Thread(runnableObj); // create the thread : pass runnable object
        thread.start(); // start the thread : internally call run method -> invoke run() --> target.run() i.e., runnableObj.run()
        System.out.println("Main method over: " + Thread.currentThread().getName());
    }
}

// Execution --> main thread -->
