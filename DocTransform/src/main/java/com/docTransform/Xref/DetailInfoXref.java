package com.docTransform.Xref;

import com.docTransform.model.ReferenceMap;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "detailInfoXref")
public class DetailInfoXref { 

	@JacksonXmlProperty(localName = "InfoRef")
	private ReferenceMap infoRef;

	public ReferenceMap getInfoRef() {
		return infoRef;
	}

	public void setInfoRef(ReferenceMap infoRef) {
		this.infoRef = infoRef;
	}

}
