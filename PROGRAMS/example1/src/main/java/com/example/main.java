package com.example;

import com.example.beans.HelloBean;
import com.example.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext t = new AnnotationConfigApplicationContext(BeanConfig.class);
        HelloBean h = t.getBean(HelloBean.class);
        System.out.println("Hello " + h.getName());
    }
}
