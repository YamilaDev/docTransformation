package com.docTransform.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.docTransform.Xref.HeaderAttachmentXrefs;
import com.docTransform.Xref.HeaderCustomerPreferenceXrefs;
import com.docTransform.Xref.HeaderInfoRefXrefs;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType; 

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "header")
public class Header {
	public Header() {
	}
	@JacksonXmlProperty(localName = "FieldTicketNo")
	private Integer fieldTicketNo;

	@JacksonXmlProperty(localName = "PurchaseOrderNo")
	private String purchaseOrderNo;

	@JacksonXmlProperty(localName = "PurchaseOrderType")
	private String purchaseOrderType;

	@JacksonXmlProperty(localName = "SalesOrderNo")
	private String salesOrderNo;

	@JacksonXmlProperty(localName = "InvoiceNo")
	private String invoiceNo;

	@JacksonXmlProperty(localName = "InvoiceType")
	private String invoiceType;

	@JacksonXmlProperty(localName = "PackingSlipNo")
	private String packingSlipNo;

	@JacksonXmlProperty(localName = "Status")
	private String status;

	@JacksonXmlProperty(localName = "NewUpdate")
	private String newUpdate;

	@JacksonXmlProperty(localName = "InvoiceDate")
	private String invoiceDate;

	@JacksonXmlProperty(localName = "RequestedDeliveryDate")
	private String requestedDeliveryDate;

	@JacksonXmlProperty(localName = "PromisedDate")
	private String promisedDate;

	@JacksonXmlProperty(localName = "ShippedDate")
	private String shippedDate;

	@JacksonXmlProperty(localName = "StartDate")
	private String startDate;

	@JacksonXmlProperty(localName = "EndDate")
	private String endDate;

	@JacksonXmlProperty(localName = "PaymentTermsShort")
	private String paymentTermsShort;

	@JacksonXmlProperty(localName = "PaymentTerms")
	private String paymentTerms;

	@JacksonXmlProperty(localName = "Comments")
	private String comments;

	@JacksonXmlProperty(localName = "BillTo")
	private Address billTo;

	@JacksonXmlProperty(localName = "RemitTo")
	private Address remitTo;

	@JacksonXmlProperty(localName = "Seller")
	private Address seller;

	@JacksonXmlProperty(localName = "ShipTo")
	private Address shipTo;

	@JacksonXmlProperty(localName = "SoldTo")
	private Address soldTo;

	@JacksonXmlProperty(localName = "ShipFrom")
	private Address shipFrom;

	@JacksonXmlProperty(localName = "CustomerPreferenceXrefs")
	private HeaderCustomerPreferenceXrefs customerPreferenceXrefs;

	@JacksonXmlProperty(localName = "AttachmentXrefs")
	private HeaderAttachmentXrefs attachmentXrefs;

	@JacksonXmlProperty(localName = "InfoRefXrefs")
	private HeaderInfoRefXrefs infoRefXrefs;

	public Integer getFieldTicketNo() {
		return fieldTicketNo;
	}

	public void setFieldTicketNo(Integer fieldTicketNo) {
		this.fieldTicketNo = fieldTicketNo;
	}

	public String getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	public void setPurchaseOrderNo(String purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	public String getPurchaseOrderType() {
		return purchaseOrderType;
	}

	public void setPurchaseOrderType(String purchaseOrderType) {
		this.purchaseOrderType = purchaseOrderType;
	}

	public String getSalesOrderNo() {
		return salesOrderNo;
	}

	public void setSalesOrderNo(String salesOrderNo) {
		this.salesOrderNo = salesOrderNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNewUpdate() {
		return newUpdate;
	}

	public void setNewUpdate(String newUpdate) {
		this.newUpdate = newUpdate;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getRequestedDeliveryDate() {
		return requestedDeliveryDate;
	}

	public void setRequestedDeliveryDate(String requestedDeliveryDate) {
		this.requestedDeliveryDate = requestedDeliveryDate;
	}

	public String getPromisedDate() {
		return promisedDate;
	}

	public void setPromisedDate(String promisedDate) {
		this.promisedDate = promisedDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Address getBillTo() {
		return billTo;
	}

	public void setBillTo(Address billTo) {
		this.billTo = billTo;
	}

	public Address getRemitTo() {
		return remitTo;
	}

	public void setRemitTo(Address remitTo) {
		this.remitTo = remitTo;
	}

	public Address getSeller() {
		return seller;
	}

	public void setSeller(Address seller) {
		this.seller = seller;
	}

	public Address getShipTo() {
		return shipTo;
	}

	public void setShipTo(Address shipTo) {
		this.shipTo = shipTo;
	}

	public Address getSoldTo() {
		return soldTo;
	}

	public void setSoldTo(Address soldTo) {
		this.soldTo = soldTo;
	}

	public Address getShipFrom() {
		return shipFrom;
	}

	public void setShipFrom(Address shipFrom) {
		this.shipFrom = shipFrom;
	}

	public String getPackingSlipNo() {
		return packingSlipNo;
	}

	public void setPackingSlipNo(String packingSlipNo) {
		this.packingSlipNo = packingSlipNo;
	}

	public String getPaymentTermsShort() {
		return paymentTermsShort;
	}

	public void setPaymentTermsShort(String paymentTermsShort) {
		this.paymentTermsShort = paymentTermsShort;
	}

	public HeaderCustomerPreferenceXrefs getCustomerPreferenceXrefs() {
		return customerPreferenceXrefs;
	}

	public void setCustomerPreferenceXrefs(HeaderCustomerPreferenceXrefs customerPreferenceXrefs) {
		this.customerPreferenceXrefs = customerPreferenceXrefs;
	}

	public HeaderAttachmentXrefs getAttachmentXrefs() {
		return attachmentXrefs;
	}

	public void setAttachmentXrefs(HeaderAttachmentXrefs attachmentXrefs) {
		this.attachmentXrefs = attachmentXrefs;
	}

	public HeaderInfoRefXrefs getInfoRefXrefs() {
		return infoRefXrefs;
	}

	public void setInfoRefXrefs(HeaderInfoRefXrefs infoRefXrefs) {
		this.infoRefXrefs = infoRefXrefs;
	}

}
