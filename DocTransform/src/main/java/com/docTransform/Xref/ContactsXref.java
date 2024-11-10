package com.docTransform.Xref;

import com.docTransform.model.Contact;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Contact")
public class ContactsXref {

	@JacksonXmlProperty(localName = "Contact")
	@JacksonXmlElementWrapper(useWrapping = false)
	private Contact[] contact;

	public Contact[] getContact() {
		return contact;
	}

	public void setContact(Contact[] contact) {
		this.contact = contact;
	}

}
