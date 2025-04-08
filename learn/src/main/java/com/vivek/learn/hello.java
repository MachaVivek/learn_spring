package com.vivek.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping
    public String helloFunction(){
        return "Hello world success";
    }

    @Autowired   // This @Autowired annotation is used to connect this object with the Parent class. It uses type for checking
    // in the below we are using the parent type for creating the object inorder to use the goodManner() function but that function is present in both Child1 and Child2 classes
    // here we have two options
    // one is giving more priority to one class by using @Primary annotation

    @Qualifier("child1")
    // second option is using the @Qualifier where you have to mention the name of the class from where goodManner() function has to be taken
    // here we have to give the name of the instance of the class generally same name of the class but the first letter is also small

    Parent parent;  // this is called field injection.

    public void sampleFunction(){
        parent.goodManner();
    }

    // here the constructor injection has done. so the @Autowired will present by default
    Child1 child1;
    hello (Child1 child1Obj){
        this.child1= child1Obj;
    }
    public void sampleFunction2(){
        child1.goodManner();
    }

    // here the setter injection has done. so the @Autowired should be given
    @Autowired
    Child2 child2;
    public  void setter (Child2 child2Obj){
        this.child2= child2Obj;
    }
    public void sampleFunction3(){
        child2.goodManner();
    }
}

