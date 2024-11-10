package com.docTransform.Xref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "detailInfoRefXref")
public class DetailInfoRefXrefs {

	@JacksonXmlProperty(localName = "DetailInfoRefXref")
	@JacksonXmlElementWrapper(useWrapping = false)
	private DetailInfoXref[] detailInfoRefXref;

	public DetailInfoXref[] getDetailInfoRefXref() {
		return detailInfoRefXref;
	}

	public void setDetailInfoRefXref(DetailInfoXref[] detailInfoRefXref) {
		this.detailInfoRefXref = detailInfoRefXref;
	}

}
