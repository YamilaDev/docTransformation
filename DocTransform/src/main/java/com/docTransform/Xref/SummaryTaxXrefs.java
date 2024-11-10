package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "summaryTaxXrefs")
public class SummaryTaxXrefs {

	@JacksonXmlProperty(localName = "DocumentSummaryTaxXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private SummaryTaxXref[] documentSummaryTaxXref;

	public SummaryTaxXref[] getDocumentSummaryTaxXref() {
		return documentSummaryTaxXref;
	}

	public void setDocumentSummaryTaxXref(SummaryTaxXref[] documentSummaryTaxXref) {
		this.documentSummaryTaxXref = documentSummaryTaxXref;
	}

}
