package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Vehicle {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Inside Init Function");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Inside Destroy Function");
    }

}
