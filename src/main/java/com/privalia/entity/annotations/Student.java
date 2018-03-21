package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;







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
	
	public int getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student() {
		super();
	}
	

	/**
	 * @param idStudent
	 * @param name
	 * @param surname
	 * @param age
	 * @param addresss
	 */
	@Autowired
	public Student(int idStudent, String name, String surname, int age, Address address) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addresss=");
		builder.append(address.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
