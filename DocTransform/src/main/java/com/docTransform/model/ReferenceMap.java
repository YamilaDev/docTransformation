package com.docTransform.model;
 
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@XmlRootElement
@JacksonXmlRootElement(localName = "referenceMap")
public class ReferenceMap { 
	public ReferenceMap() {
	}
	@JacksonXmlProperty(localName = "Key") 
	private String key;

	@JacksonXmlProperty(localName = "Value") 
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
