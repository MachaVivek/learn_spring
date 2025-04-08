package com.vivek.learn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
 @Primary  //,This annotation is used to give top priority for this class if there are more than one class implementing the interface and using the same method
public class Child2 implements Parent{
    public void goodManner(){
        System.out.println("This is the child2 class");
    }
}
