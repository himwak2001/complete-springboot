package com.app.component;

public class OnlineOrder implements Order{
    public OnlineOrder(){
        System.out.println("OnlineOrder instance initialization !!!");
    }

    @Override
    public void createOrder() {
        System.out.println("Online order created !!!");
    }
}
