package com.docTransform.Xref;

import com.docTransform.model.ReferenceMap;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "customerPreferenceXref")
public class CustomerPreferenceXref { 

	@JacksonXmlProperty(localName = "CustomerPreference")
	private ReferenceMap customerPreference;

	public ReferenceMap getCustomerPreference() {
		return customerPreference;
	}

	public void setCustomerPreference(ReferenceMap customerPreference) {
		this.customerPreference = customerPreference;
	}

}
