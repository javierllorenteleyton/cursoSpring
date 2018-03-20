package com.privalia.presentation.annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.privalia.presentation.annotations2.HelloWorld;


public class Principal {
	public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        context.scan("com.privalia.presentation.annotations2");
        context.refresh();
        
        HelloWorld helloWorld= (HelloWorld) context.getBean(HelloWorld.class);        
        System.out.println(helloWorld.getHello());
        
      
        
        context.close();
	}
}
