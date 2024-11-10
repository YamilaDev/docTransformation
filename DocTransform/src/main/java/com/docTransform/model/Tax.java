package com.docTransform.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@XmlRootElement
@JacksonXmlRootElement(localName = "tax")
public class Tax {

	public Tax() { 
	}
	
	@JacksonXmlProperty(localName = "Type")
	private String type;

	@JacksonXmlProperty(localName = "StateProvince")
	private String stateProvince;

	@JacksonXmlProperty(localName = "CountryCode")
	private String countryCode;

	@JacksonXmlProperty(localName = "Exempt")
	private String exempt;

	@JacksonXmlProperty(localName = "Rate")
	private BigDecimal rate;

	@JacksonXmlProperty(localName = "TaxAmount")
	private BigDecimal taxAmount;

	@JacksonXmlProperty(localName = "Currency")
	private String currency;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getExempt() {
		return exempt;
	}

	public void setExempt(String exempt) {
		this.exempt = exempt;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	 

}
