package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;




public class Principal {
	public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
 Student student= (Student) context.getBean("student");
        
        System.out.println(student.toString());
      

        context.close();
	    
	}
}
