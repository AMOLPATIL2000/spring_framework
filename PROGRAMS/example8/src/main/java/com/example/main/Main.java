package com.example.main;

import com.example.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e = context.getBean("emp",Employee.class);
        e.setEid(100);
        e.setEname("Amol");
        e.showDetails();
    }
}
