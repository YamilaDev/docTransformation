package com.docTransform.model;
 
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@JacksonXmlRootElement(localName = "contact")
public class Contact {
	public Contact() {
	}
	@JacksonXmlProperty(localName = "ContactType") 
	private String contactType;

	@JacksonXmlProperty(localName = "Name") 
	private String name;

	@JacksonXmlProperty(localName = "Description") 
	private String description;

	@JacksonXmlProperty(localName = "PhoneNo") 
	private String phoneNo;

	@JacksonXmlProperty(localName = "MobileNo") 
	private String mobileNo;

	@JacksonXmlProperty(localName = "FaxNo") 
	private String faxNo;

	@JacksonXmlProperty(localName = "PagerNo") 
	private String pagerNo;

	@JacksonXmlProperty(localName = "EmailAddress") 
	private String emailAddress;

	@JacksonXmlProperty(localName = "EmailAddress2") 
	private String emailAddress2;

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
 

	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress2() {
		return emailAddress2;
	}

	public void setEmailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}

	public String getPagerNo() {
		return pagerNo;
	}

	public void setPagerNo(String pagerNo) {
		this.pagerNo = pagerNo;
	}

	 
}
