package com.docTransform.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "HeaderInformation")
@XmlAccessorType(XmlAccessType.PROPERTY)
@JacksonXmlRootElement(localName = "HeaderInformation")

public class HeaderInformation {
	public HeaderInformation() {
	}

	@XmlElement
	private String DocumentNumber;
	@XmlElement
	private String DocumentDate;
	@XmlElement
	private String DocumentType;
	@XmlElement
	private String Currency;
	@XmlElement
	private String OriginalDocumentNumber;
	@XmlElement
	private String OperationType;

	public String getDocumentNumber() {
		return DocumentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		DocumentNumber = documentNumber;
	}

	public String getDocumentDate() {
		return DocumentDate;
	}

	public void setDocumentDate(String documentDate) {
		DocumentDate = documentDate;
	}

	public String getDocumentType() {
		return DocumentType;
	}

	public void setDocumentType(String documentType) {
		DocumentType = documentType;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getOriginalDocumentNumber() {
		return OriginalDocumentNumber;
	}

	public void setOriginalDocumentNumber(String originalDocumentNumber) {
		OriginalDocumentNumber = originalDocumentNumber;
	}

	public String getOperationType() {
		return OperationType;
	}

	public void setOperationType(String operationType) {
		OperationType = operationType;
	}

}
