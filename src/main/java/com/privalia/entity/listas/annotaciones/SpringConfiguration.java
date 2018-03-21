package com.privalia.entity.listas.annotaciones;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;



public class SpringConfiguration {

	@Bean(name = "student")
	public Student student() {
		return new Student();
	}
	
	
	
	@Bean(name = "teacher")
	public List<Teacher> teachers() {
		List<Teacher> teachers= new ArrayList<Teacher>();
		teachers.add( new Teacher(1,"Pepe"));
		teachers.add( new Teacher(2,"Juan"));
		return teachers;
	}
	
	
}
