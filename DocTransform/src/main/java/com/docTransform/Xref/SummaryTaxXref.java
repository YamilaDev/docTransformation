package com.docTransform.Xref;

import com.docTransform.model.Tax;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "summaryTax")
public class SummaryTaxXref {

	@JacksonXmlProperty(localName = "Tax")
	private Tax tax;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
