package com.privalia.entity.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@PropertySource("classpath:config.properties")
@Configuration
public class SpringConfiguration {

	
	@Bean()
	public static PropertySourcesPlaceholderConfigurer propertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "student")
	public Student student() {
		return new Student();
	}
	
	

	
	@Bean(name = "address")
	public Address address() {
		return new Address();
	}
	
}
