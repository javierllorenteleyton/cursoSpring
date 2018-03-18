package com.privalia.presentation.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
	
	@Autowired
	@Value("Hello world from annotations!")
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

	public void setHello(String hello) {
		this.hello = hello;
	}
}
