package com.dprasad.myApp;


import org.springframework.stereotype.Component;

@Component
public class Dev {

    public void build(){
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
