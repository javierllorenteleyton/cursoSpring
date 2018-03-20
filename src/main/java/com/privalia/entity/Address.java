package com.privalia.entity;


public class Address {

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

	private int idAddress;
	private String street;
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
	
	
	public Address(int idAddress,String street) {
		super();
		this.idAddress=idAddress;
		this.street=street;
	}
}
