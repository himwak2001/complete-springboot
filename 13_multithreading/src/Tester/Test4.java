package Tester;

import shared_resource.SharedResource;

public class Test4 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try{
                Thread.sleep(3000); // running to timed waiting state : wait to run consumer thread first
            }catch (Exception ex){
                ex.printStackTrace();
            }
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
