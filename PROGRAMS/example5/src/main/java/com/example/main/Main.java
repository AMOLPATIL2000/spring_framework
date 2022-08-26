package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext t = new AnnotationConfigApplicationContext(BeanConfig.class);
        Vehicle v = t.getBean(Vehicle.class);
        System.out.println(v.getName());
        t.close();
        System.out.println("End of Program");
    }
}
