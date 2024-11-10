package com.docTransform.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.docTransform.Xref.DocumentDetailXref;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.PROPERTY)
@JacksonXmlRootElement(localName = "document")

public class Document {
	public Document() {
	}

	@JacksonXmlProperty(localName = "Id")
	private Integer id;

	@JacksonXmlProperty(localName = "BatchNo")
	private Integer batchNo;

	@JacksonXmlProperty(localName = "DocumentType")
	private String documentType;

	@JacksonXmlProperty(localName = "DocumentPurpose")
	private String documentPurpose;

	@JacksonXmlProperty(localName = "BuyerIdentifier")
	private String buyerIdentifier;

	@JacksonXmlProperty(localName = "SellerIdentifier")
	private String sellerIdentifier;

	@JacksonXmlProperty(localName = "DocumentCreatedDate")
	private String documentCreatedDate;

	@JacksonXmlProperty(localName = "TransmissionDate")
	private String transmissionDate;

	@JacksonXmlProperty(localName = "Header")
	private Header header;

	@JacksonXmlProperty(localName = "Summary")
	private Summary summary;

	@JacksonXmlProperty(localName = "Details")
	private DocumentDetailXref details;

	public Integer getId() {
		return id;
	}

	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentPurpose() {
		return documentPurpose;
	}

	public void setDocumentPurpose(String documentPurpose) {
		this.documentPurpose = documentPurpose;
	}

	public String getBuyerIdentifier() {
		return buyerIdentifier;
	}

	public void setBuyerIdentifier(String buyerIdentifier) {
		this.buyerIdentifier = buyerIdentifier;
	}

	public String getSellerIdentifier() {
		return sellerIdentifier;
	}

	public void setSellerIdentifier(String sellerIdentifier) {
		this.sellerIdentifier = sellerIdentifier;
	}

	public String getDocumentCreatedDate() {
		return documentCreatedDate;
	}

	public void setDocumentCreatedDate(String documentCreatedDate) {
		this.documentCreatedDate = documentCreatedDate;
	}

	public String getTransmissionDate() {
		return transmissionDate;
	}

	public void setTransmissionDate(String transmissionDate) {
		this.transmissionDate = transmissionDate;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public DocumentDetailXref getDetails() {
		return details;
	}

	public void setDetails(DocumentDetailXref details) {
		this.details = details;
	}

}
