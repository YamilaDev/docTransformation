package com.docTransform.Xref;

import com.docTransform.model.Detail;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Detail")
public class DocumentDetailXref { 
	
	@JacksonXmlProperty(localName = "Detail")
	@JacksonXmlElementWrapper(useWrapping = false)
	private Detail[] detail;

	public Detail[] getDetail() {
		return detail;
	}

	public void setDetail(Detail[] detail) {
		this.detail = detail;
	}

}
