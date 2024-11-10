package com.docTransform.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.docTransform.Xref.SummaryTaxXrefs;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@XmlRootElement
@JacksonXmlRootElement(localName = "summary")
public class Summary {
	public Summary() {
	}
	@JacksonXmlProperty(localName = "TotalLineCount")
	private Integer totalLineCount;

	@JacksonXmlProperty(localName = "SubTotal")
	private BigDecimal subTotal;

	@JacksonXmlProperty(localName = "TaxAmount")
	private BigDecimal taxAmount;

	@JacksonXmlProperty(localName = "Total")
	private BigDecimal total;

	@JacksonXmlProperty(localName = "Currency")
	private String currency;

	@JacksonXmlProperty(localName = "TaxXrefs")
	private SummaryTaxXrefs taxXrefs; 

	public Integer getTotalLineCount() {
		return totalLineCount;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public String getCurrency() {
		return currency;
	}

	public SummaryTaxXrefs getTaxXrefs() {
		return taxXrefs;
	}

	public void setTotalLineCount(Integer totalLineCount) {
		this.totalLineCount = totalLineCount;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setTaxXrefs(SummaryTaxXrefs taxXrefs) {
		this.taxXrefs = taxXrefs;
	}

}
