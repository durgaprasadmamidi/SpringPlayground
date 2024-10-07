package com.dprasad.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling with lot of bugs but faster....");
    }
}
