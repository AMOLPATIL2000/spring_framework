package com.example.config;

import com.example.beans.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    HelloBean sayHello()
    {
        HelloBean h = new HelloBean();
        h.setName("AMOL");
        return h;
    }
}
