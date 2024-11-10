package com.docTransform.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.docTransform.Xref.DetailAttachmentXrefs;
import com.docTransform.Xref.DetailCustomerPreferenceXrefs;
import com.docTransform.Xref.DetailInfoRefXrefs;
import com.docTransform.Xref.DetailTaxXrefs;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@JacksonXmlRootElement(localName = "detail")
public class Detail {
	public Detail() {
	}
	@JacksonXmlProperty(localName = "LineNo")
	private Integer lineNo;

	@JacksonXmlProperty(localName = "FieldTicketLineNo")
	private String fieldTicketLineNo;

	@JacksonXmlProperty(localName = "PurchaseOrderLineNo")
	private BigDecimal purchaseOrderLineNo;

	@JacksonXmlProperty(localName = "InvoiceLineNo")
	private BigDecimal invoiceLineNo;

	@JacksonXmlProperty(localName = "Status")
	private String status;

	@JacksonXmlProperty(localName = "NewUpdate")
	private String newUpdate;

	@JacksonXmlProperty(localName = "BuyerItemId")
	private long buyerItemId;

	@JacksonXmlProperty(localName = "BuyerItemQualifier")
	private String buyerItemQualifier;

	@JacksonXmlProperty(localName = "SellerItemId")
	private String sellerItemId;

	@JacksonXmlProperty(localName = "SellerProductServiceNo")
	private String sellerProductServiceNo;

	@JacksonXmlProperty(localName = "Name")
	private String name;

	@JacksonXmlProperty(localName = "Description")
	private String description;

	@JacksonXmlProperty(localName = "Quantity")
	private long quantity;

	@JacksonXmlProperty(localName = "QuantityShipped")
	private long quantityShipped;

	@JacksonXmlProperty(localName = "QuantityBackOrdered")
	private long quantityBackOrdered;

	@JacksonXmlProperty(localName = "QuantityOriginal")
	private long quantityOriginal;

	@JacksonXmlProperty(localName = "UnitOfMeasure")
	private String unitOfMeasure;

	@JacksonXmlProperty(localName = "Price")
	private BigDecimal price;

	@JacksonXmlProperty(localName = "Total")
	private BigDecimal total;

	@JacksonXmlProperty(localName = "Currency")
	private String currency;

	@JacksonXmlProperty(localName = "RequestedDeliveryDate")
	private String requestedDeliveryDate;

	@JacksonXmlProperty(localName = "PromisedDate")
	private String promisedDate;

	@JacksonXmlProperty(localName = "Comments")
	private String comments;

	@JacksonXmlProperty(localName = "ShipTo")
	private Address shipTo;

	@JacksonXmlProperty(localName = "AttachmentXrefs")
	private DetailAttachmentXrefs attachmentXrefs;

	@JacksonXmlProperty(localName = "CustomerPreferenceXrefs")
	private DetailCustomerPreferenceXrefs detailCustomerPreferenceXref;

	@JacksonXmlProperty(localName = "InfoRefXrefs")
	private DetailInfoRefXrefs infoRefXrefs;

	@JacksonXmlProperty(localName = "TaxXrefs")
	private DetailTaxXrefs detailTaxXref;

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public String getFieldTicketLineNo() {
		return fieldTicketLineNo;
	}

	public void setFieldTicketLineNo(String fieldTicketLineNo) {
		this.fieldTicketLineNo = fieldTicketLineNo;
	}

	public BigDecimal getPurchaseOrderLineNo() {
		return purchaseOrderLineNo;
	}

	public void setPurchaseOrderLineNo(BigDecimal purchaseOrderLineNo) {
		this.purchaseOrderLineNo = purchaseOrderLineNo;
	}

	public BigDecimal getInvoiceLineNo() {
		return invoiceLineNo;
	}

	public void setInvoiceLineNo(BigDecimal invoiceLineNo) {
		this.invoiceLineNo = invoiceLineNo;
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

	public String getBuyerItemQualifier() {
		return buyerItemQualifier;
	}

	public void setBuyerItemQualifier(String buyerItemQualifier) {
		this.buyerItemQualifier = buyerItemQualifier;
	}

	public String getSellerItemId() {
		return sellerItemId;
	}

	public void setSellerItemId(String sellerItemId) {
		this.sellerItemId = sellerItemId;
	}

	public String getSellerProductServiceNo() {
		return sellerProductServiceNo;
	}

	public void setSellerProductServiceNo(String sellerProductServiceNo) {
		this.sellerProductServiceNo = sellerProductServiceNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getBuyerItemId() {
		return buyerItemId;
	}

	public long getQuantity() {
		return quantity;
	}

	public long getQuantityShipped() {
		return quantityShipped;
	}

	public long getQuantityBackOrdered() {
		return quantityBackOrdered;
	}

	public long getQuantityOriginal() {
		return quantityOriginal;
	}

	public void setBuyerItemId(long buyerItemId) {
		this.buyerItemId = buyerItemId;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public void setQuantityShipped(long quantityShipped) {
		this.quantityShipped = quantityShipped;
	}

	public void setQuantityBackOrdered(long quantityBackOrdered) {
		this.quantityBackOrdered = quantityBackOrdered;
	}

	public void setQuantityOriginal(long quantityOriginal) {
		this.quantityOriginal = quantityOriginal;
	}

	public Address getShipTo() {
		return shipTo;
	}

	public void setShipTo(Address shipTo) {
		this.shipTo = shipTo;
	}

	public DetailAttachmentXrefs getAttachmentXrefs() {
		return attachmentXrefs;
	}

	public void setAttachmentXrefs(DetailAttachmentXrefs attachmentXrefs) {
		this.attachmentXrefs = attachmentXrefs;
	}

 

	public DetailInfoRefXrefs getInfoRefXrefs() {
		return infoRefXrefs;
	}

	public void setInfoRefXrefs(DetailInfoRefXrefs infoRefXrefs) {
		this.infoRefXrefs = infoRefXrefs;
	}

	public void setDetailCustomerPreferenceXref(DetailCustomerPreferenceXrefs detailCustomerPreferenceXref) {
		this.detailCustomerPreferenceXref = detailCustomerPreferenceXref;
	}

	public void setDetailTaxXref(DetailTaxXrefs detailTaxXref) {
		this.detailTaxXref = detailTaxXref;
	}

	public DetailCustomerPreferenceXrefs getDetailCustomerPreferenceXref() {
		return detailCustomerPreferenceXref;
	}

	public DetailTaxXrefs getDetailTaxXref() {
		return detailTaxXref;
	}

}
