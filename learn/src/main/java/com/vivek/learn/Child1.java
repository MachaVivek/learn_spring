package com.vivek.learn;

import org.springframework.stereotype.Component;

// we are using the @Component annotation by this the spring able to know that, it has to create objects for this class
@Component
public class Child1 implements Parent{
    public void goodManner(){
        System.out.println("This is the child 1 class");
    }
}
