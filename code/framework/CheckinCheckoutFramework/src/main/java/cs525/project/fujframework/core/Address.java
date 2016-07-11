/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the MIT License (MIT);
 */
package cs525.project.fujframework.core;

/**
 * defines an address entity
 * 
 * @author paudelumesh
 *
 * @version 1.0.0
 */
public class Address {
	private int addressId;
	private int personId;
	private boolean isCustomer;
	private String streetAddress;
	private String city;
	private int zipCode;
	private String state;

	/**
	 * creates an address object
	 * 
	 * @param streetAddress
	 * @param city
	 * @param zipCode
	 * @param state
	 */
	public Address(String streetAddress, String city, int zipCode, String state) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}

	/**
	 * @param personId
	 *            the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}

	/**
	 * @return the isCustomer
	 */
	public boolean isCustomer() {
		return isCustomer;
	}

	/**
	 * @param isCustomer
	 *            the isCustomer to set
	 */
	public void setIsCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}

}
