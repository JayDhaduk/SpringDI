package com.springDI;

public class Address {

	private int home_num;
	private String city;
	private String town;
	private String postcode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int home_num, String city, String town, String postcode) {
		super();
		this.home_num = home_num;
		this.city = city;
		this.town = town;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [home_num=" + home_num + ", city=" + city + ", town=" + town + ", postcode=" + postcode + "]\n";
	}
	
	
	
}
