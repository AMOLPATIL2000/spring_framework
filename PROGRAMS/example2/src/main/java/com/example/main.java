package com.example;

import org.example.beans.Vehicle;
import org.example.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext t = new AnnotationConfigApplicationContext(BeanConfig.class);
        Vehicle v1 = t.getBean("honda", Vehicle.class);
        Vehicle v2 = t.getBean("audi",Vehicle.class);
        String hello = t.getBean(String.class);
        Integer n = t.getBean(Integer.class);

        System.out.println(v1.getName());
        System.out.println(v2.getName());
        System.out.println(hello);
        System.out.println(n);

        Vehicle w = t.getBean("wagonr",Vehicle.class);
        System.out.println(w.getName());
    }
}
