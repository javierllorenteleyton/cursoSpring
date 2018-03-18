package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
        HelloWorld helloWorld= (HelloWorld) context.getBean("helloWorid");
        
        System.out.println(helloWorld.getHello());
        
        HelloWorld helloWorldConst= (HelloWorld) context.getBean("helloWoridConst");
        
        System.out.println(helloWorldConst.getHello());
        
        context.close();
	    
	}

}
