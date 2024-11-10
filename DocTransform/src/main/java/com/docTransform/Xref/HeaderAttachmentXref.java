package com.docTransform.Xref;

import com.docTransform.model.ReferenceMap;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "headerAttachmentXref")
public class HeaderAttachmentXref {
	
	@JacksonXmlProperty(localName = "AttachmentPreference")
	private ReferenceMap attachmentPreference;

	public ReferenceMap getAttachmentPreference() {
		return attachmentPreference;
	}

	public void setAttachmentPreference(ReferenceMap attachmentPreference) {
		this.attachmentPreference = attachmentPreference;
	}

}
