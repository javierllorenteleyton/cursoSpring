package com.privalia.builder.example;

import lombok.ToString;

@ToString
public class Employee {
	private Long id;
	private String name;
	private int gender;
	private String address;
	private String hobby;

	private Employee() {

	}

	public static class EmployeeBuilder {
		private Long id;
		private String name;
		private int gender;
		private String address;
		private String hobby;

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public EmployeeBuilder(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Employee build() {
			Employee emp = new Employee();
			emp.id = id;
			emp.name = name;
			emp.gender = gender;
			emp.address = address;
			emp.hobby = hobby;
			return emp;
		}
	}
}
