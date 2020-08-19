package com.orderitems.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderItemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderItemsApplication.class, args);
    }
}
