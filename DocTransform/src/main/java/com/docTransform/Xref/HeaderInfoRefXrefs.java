package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "headerInfoRefXrefs")
public class HeaderInfoRefXrefs { 

	@JacksonXmlProperty(localName = "HeaderInfoRefXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private HeaderInfoRefXref[] headerInfoRefXref;

	public HeaderInfoRefXref[] getHeaderInfoRefXref() {
		return headerInfoRefXref;
	}

	public void setHeaderInfoRefXref(HeaderInfoRefXref[] headerInfoRefXref) {
		this.headerInfoRefXref = headerInfoRefXref;
	}

}