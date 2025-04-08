package com.vivek.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(LearnApplication.class, args);

		// the below is another way to get the object and use their properties
		hello obj = context.getBean(hello.class);
		obj.sampleFunction();

		obj.sampleFunction2();
		obj.sampleFunction3();
	}

}
