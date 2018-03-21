package com.privalia.entity.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor  @ToString
@Component(value="address")
public class Address {
	@Autowired
	@Value("1")
	private int idAddress;
	
	@Autowired
	@Value("Address ssss")
	private String street;
}
