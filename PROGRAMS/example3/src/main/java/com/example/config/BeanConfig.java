package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Bean("honda")
    Vehicle honda()
    {
        Vehicle honda = new Vehicle();
        honda.setName("Honda");
        return honda;
    }

    @Bean("audi")
    Vehicle audi()
    {
        Vehicle honda = new Vehicle();
        honda.setName("Audi");
        return honda;
    }


    @Primary
    @Bean("wagonr")
    Vehicle wagonr()
    {
        Vehicle honda = new Vehicle();
        honda.setName("WagonR");
        return honda;
    }
}
