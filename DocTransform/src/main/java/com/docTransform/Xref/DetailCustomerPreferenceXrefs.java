package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "detailCustomerPreferenceXrefs")
public class DetailCustomerPreferenceXrefs { 
	
	@JacksonXmlProperty(localName = "DetailCustomerPreferenceXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private CustomerPreferenceXref[] customerPreferenceXref;

	public CustomerPreferenceXref[] getCustomerPreferenceXref() {
		return customerPreferenceXref;
	}

	public void setCustomerPreferenceXref(CustomerPreferenceXref[] customerPreferenceXref) {
		this.customerPreferenceXref = customerPreferenceXref;
	}

}
