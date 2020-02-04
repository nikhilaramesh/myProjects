package com.Mindgate.Pojo;

public class AddressPojo
{
	private String street,city,state;
	
	public AddressPojo() {
		// TODO Auto-generated constructor stub
	}

	public AddressPojo(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressPojo [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
