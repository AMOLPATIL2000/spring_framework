package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext t = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle v = t.getBean(Vehicle.class);
        System.out.println(v.getName());
    }
}
