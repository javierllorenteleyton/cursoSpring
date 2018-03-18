package com.privalia.presentation.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
   
	@Bean(name = "helloWorid")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
