package com.privalia.profiles;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileTest {

	public static void main(String[] args){
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.scan("com.privalia.profiles");
		ctx.refresh();
		
		User user = ctx.getBean(User.class);
		System.out.println("id "+user.id+" ,Name "+user.name);
		ctx.close();
		
	}
}
