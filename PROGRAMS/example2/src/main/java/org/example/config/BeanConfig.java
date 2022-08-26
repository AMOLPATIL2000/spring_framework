package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    Vehicle honda()
    {
        Vehicle honda = new Vehicle();
        honda.setName("Honda");
        return  honda;
    }

    @Bean
    Vehicle audi()
    {
        Vehicle audi= new Vehicle();
        audi.setName("Audi");
        return  audi;
    }

    @Bean("wagonr")
    Vehicle wagonr()
    {
        Vehicle w = new Vehicle();
        w.setName("WagonR");
        return  w;
    }

    @Bean
    String hello()
    {
        return  "Hello";
    }
    @Bean
    Integer num()
    {
        return 100;
    }
}
