package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;



public class Address {
	
	@Autowired
	@Value("1")
	private int idAddress;
	
	@Autowired
	@Value("Address ssss")
	private String street;
	
public Address() {
	super();
	}
	
	public Address(int idAddress,String street) {
		super();
		this.idAddress=idAddress;
		this.street=street;
	}
	
	public int getIdAddress() {
		return idAddress;
	}
	
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [idAddress=");
		builder.append(idAddress);
		builder.append(", street=");
		builder.append(street);
		builder.append("]");
		return builder.toString();
	}
	
}
