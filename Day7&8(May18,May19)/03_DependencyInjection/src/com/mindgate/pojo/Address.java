package com.mindgate.pojo;

public class Address {

	private int addressId;
	private String street;
	private String city;
	private String state;
	
	
	public Address() {
		System.out.println("default constructor of Address called");
	}


	public Address(int addressId, String street, String city, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		System.out.println("Overloaded constructor of Address Called");
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		System.out.println("Setting addressId :: "+addressId);
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		System.out.println("Setting street :: "+street);
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		System.out.println("Setting city :: "+city);
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		System.out.println("Setting :: "+state);
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
