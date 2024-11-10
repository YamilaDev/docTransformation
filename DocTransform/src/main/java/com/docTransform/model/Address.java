package com.docTransform.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.docTransform.Xref.ContactsXref;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
@XmlRootElement
@JacksonXmlRootElement(localName = "address")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Address {
	public Address() {
	}
	@JacksonXmlProperty(localName = "Name")
	private String name;

	@JacksonXmlProperty(localName = "AddressType")
	private String addressType;

	@JacksonXmlProperty(localName = "AddressLine1")
	private String addressLine1;

	@JacksonXmlProperty(localName = "AddressLine2")
	private String addressLine2;

	@JacksonXmlProperty(localName = "AddressLine3")
	private String addressLine3;

	@JacksonXmlProperty(localName = "AddressLine4")
	private String addressLine4;

	@JacksonXmlProperty(localName = "City")
	private String city;

	@JacksonXmlProperty(localName = "StateProvince")
	private String stateProvince;

	@JacksonXmlProperty(localName = "CountryCode")
	private String countryCode;

	@JacksonXmlProperty(localName = "PostalCode")
	private String postalCode;

	@JacksonXmlProperty(localName = "ExternalLocationIdentifier")
	private String externalLocationIdentifier;

	@JacksonXmlProperty(localName = "ExternalVendorNo")
	private String externalVendorNo;

	@JacksonXmlProperty(localName = "InternalAddressNo")
	private String internalAddressNo;

	@JacksonXmlProperty(localName = "Contacts")
	private ContactsXref contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getExternalLocationIdentifier() {
		return externalLocationIdentifier;
	}

	public void setExternalLocationIdentifier(String externalLocationIdentifier) {
		this.externalLocationIdentifier = externalLocationIdentifier;
	}

	public String getExternalVendorNo() {
		return externalVendorNo;
	}

	public void setExternalVendorNo(String externalVendorNo) {
		this.externalVendorNo = externalVendorNo;
	}

	public String getInternalAddressNo() {
		return internalAddressNo;
	}

	public void setInternalAddressNo(String internalAddressNo) {
		this.internalAddressNo = internalAddressNo;
	}

	public ContactsXref getContacts() {
		return contacts;
	}

	public void setContacts(ContactsXref contacts) {
		this.contacts = contacts;
	}

}
