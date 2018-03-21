package com.privalia.entity.listas.annotaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Student {
	@Autowired
	@Value("1")
	private int idStudent;	
	@Autowired
	@Value("David")
	private String name;
	@Autowired
	@Value("soto")
	private String surname;
	@Autowired
	@Value("24")
	private int age;
	@Autowired
	@Value("#{teacher}")
	private List<Teacher> listTeacher;
}
