package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
	private String hello;

	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello) {
		super();
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}
   
	@Autowired
	@Value("HelloWorld from annotations2")
	public void setHello(String hello) {
		this.hello = hello;
	}

}
