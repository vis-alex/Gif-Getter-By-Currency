package com.alex.vis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GifGetterByCurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GifGetterByCurrencyApplication.class, args);
    }

}
