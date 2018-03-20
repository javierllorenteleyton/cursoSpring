package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        
       Student student= (Student) context.getBean("student");
       
       System.out.println(student.toString());
        
 Student student2= (Student) context.getBean("studentConst");
       
       System.out.println(student2.toString());
          
        context.close();
	    
	}
}
