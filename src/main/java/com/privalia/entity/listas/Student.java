package com.privalia.entity.listas;

import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Student {
	private int idStudent;	
	private String name;
	private String surname;
	private int age;
	private List<Teacher> listTeacher;
}
