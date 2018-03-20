package com.privalia.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Principal {
	public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        context.scan("com.privalia.presentation.annotations3");
        context.refresh();
        
        HelloWorld helloWorld= (HelloWorld) context.getBean(HelloWorld.class);        
        System.out.println(helloWorld.getHello());
        
        HelloWorld helloWorld2= (HelloWorld) context.getBean("helloWorld");        
        System.out.println(helloWorld2.getHello());
        
        context.close();
	}
}
