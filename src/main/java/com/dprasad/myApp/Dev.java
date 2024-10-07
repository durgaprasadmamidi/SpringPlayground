package com.dprasad.myApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    @Autowired
    private Computer comp;

    public void build(){
        comp.compile();
        System.out.println("Working on ... project");
    }

    public Dev() {
        System.out.println("Object created.......");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted.......");
        super.finalize();
    }


}
