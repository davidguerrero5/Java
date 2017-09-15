// David Guerrero 
// 9/15/17
package com.ualbany.hw1.problem3;

public class Address {

	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public int zipCode;
	
	public Address (String line1, String line2, String cty, String ste, int code) {
		this.addressLine1 = line1;
		this.addressLine2 = line2;
		this.city = cty;
		this.state = ste;
		this.zipCode = code;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	
	@Override
	public String toString() {
		return this.addressLine1 + " " + this.addressLine2 + "" + this.city + ", " + this.state + " " + this.zipCode;
	}
}
