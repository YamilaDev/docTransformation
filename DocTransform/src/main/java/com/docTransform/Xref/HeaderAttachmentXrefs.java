package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "headerAttachmentXrefs")
public class HeaderAttachmentXrefs {

	@JacksonXmlProperty(localName = "HeaderAttachmentXrefs")
	@JacksonXmlElementWrapper(useWrapping = false)
	private HeaderAttachmentXref[] headerAttachmentXrefs;

	public HeaderAttachmentXref[] getHeaderAttachmentXrefs() {
		return headerAttachmentXrefs;
	}

	public void setHeaderAttachmentXrefs(HeaderAttachmentXref[] headerAttachmentXrefs) {
		this.headerAttachmentXrefs = headerAttachmentXrefs;
	}

}
