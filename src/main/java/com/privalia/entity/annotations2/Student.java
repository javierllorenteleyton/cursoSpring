package com.privalia.entity.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import com.privalia.entity.annotations.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
@Component(value="student")
@PropertySource("classpath:config.properties")
public class Student {
	@Autowired
	@Value("${student.idstudent}")
	private int idStudent;
	
	@Autowired
	@Value("Pepe")
	private String name;
	
	@Autowired
	@Value("Peipto")
	private String surname;
	
	@Autowired
	@Value("24")
	private int age;
	
	@Autowired
//	@Qualifier("address")
//	@value("#{address}")
	private Address address;
	
	// to resolve $() in @Value
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
