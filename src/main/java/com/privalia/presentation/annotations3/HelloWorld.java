package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
	private String hello;

	public HelloWorld() {
		
	}
	@Autowired
	public HelloWorld(@Value("HelloWorld from annotations3") String hello) {
		super();
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}
   
	
	public void setHello(String hello) {
		this.hello = hello;
	}
}
