package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "detailAttachmentXrefs")
public class DetailAttachmentXrefs {

	@JacksonXmlProperty(localName = "DetailAttachmentXrefs")
	@JacksonXmlElementWrapper(useWrapping = false)
	private CustomerPreferenceXref[] detailAttachmentXrefs;

	public CustomerPreferenceXref[] getDetailAttachmentXrefs() {
		return detailAttachmentXrefs;
	}

	public void setDetailAttachmentXrefs(CustomerPreferenceXref[] detailAttachmentXrefs) {
		this.detailAttachmentXrefs = detailAttachmentXrefs;
	}

}
