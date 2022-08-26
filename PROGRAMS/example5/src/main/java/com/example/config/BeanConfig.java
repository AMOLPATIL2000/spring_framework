package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    Vehicle vehicle()
    {
        Vehicle v = new Vehicle();
        v.setName("Honda");
        return  v;
    }


}
