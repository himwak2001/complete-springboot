package com.app.component;

public class OfflineOrder implements Order{
    public OfflineOrder(){
        System.out.println("OfflineOrder instance initialization !!!");
    }

    @Override
    public void createOrder() {
        System.out.println("Offline Order Created !!!");
    }
}
