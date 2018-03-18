package com.privalia.presentation.lombok;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PrincipalLOK {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    
    HelloWorldLOK helloWorld= (HelloWorldLOK) context.getBean("helloWoridLok");
    
    System.out.println(helloWorld.getHello());
    
    HelloWorldLOK helloWorldConst= (HelloWorldLOK) context.getBean("helloWoridLokConst");
    
    System.out.println(helloWorldConst.getHello());
    
    context.close();
	}
}
