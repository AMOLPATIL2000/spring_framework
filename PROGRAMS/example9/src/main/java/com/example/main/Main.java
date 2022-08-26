package com.example.main;

import com.example.beans.Employee;
import com.example.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee emp = context.getBean(Employee.class);
        emp.setEid(100);
        emp.setEname("Amol");
        emp.showDetails();
    }
}
