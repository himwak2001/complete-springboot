package com.app.configuration;

import com.app.component.OfflineOrder;
import com.app.component.OnlineOrder;
import com.app.component.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Order createOrderBean(@Value("${isOnlineOrder}") boolean isOnlineOrder){
        if(isOnlineOrder){
            return new OnlineOrder();
        } else{
            return new OfflineOrder();
        }
    }
}
