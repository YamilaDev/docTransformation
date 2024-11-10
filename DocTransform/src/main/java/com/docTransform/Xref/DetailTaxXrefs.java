package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "detailTaxXref")
public class DetailTaxXrefs {

	@JacksonXmlProperty(localName = "DetailTaxXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private DetailTaxXref[] detailTaxXref;

	public DetailTaxXref[] getDetailTaxXref() {
		return detailTaxXref;
	}

	public void setDetailTaxXref(DetailTaxXref[] detailTaxXref) {
		this.detailTaxXref = detailTaxXref;
	}

}
