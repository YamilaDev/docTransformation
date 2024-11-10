package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "headerCustomerPreferenceXrefs")
public class HeaderCustomerPreferenceXrefs { 

	@JacksonXmlProperty(localName = "HeaderCustomerPreferenceXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private CustomerPreferenceXref[] customerPreferenceXref;

	public CustomerPreferenceXref[] getCustomerPreferenceXref() {
		return customerPreferenceXref;
	}

	public void setCustomerPreferenceXref(CustomerPreferenceXref[] customerPreferenceXref) {
		this.customerPreferenceXref = customerPreferenceXref;
	}

}
