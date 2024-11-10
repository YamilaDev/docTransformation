<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<Document>
			<SellerIdentifier>
				<xsl:value-of select="/document/sellerIdentifier" />
			</SellerIdentifier>
			<BuyerIdentifier>
				<xsl:value-of select="/document/buyerIdentifier" />
			</BuyerIdentifier>
			<HeaderInformation>
				<DocumentNumber>
					<xsl:value-of select="/document/header/invoiceNo" />
				</DocumentNumber>
				<DocumentDate>
					<xsl:value-of select="/document/header/invoiceDate" />
				</DocumentDate>
				<DocumentType>
					<xsl:text>ProductOrService</xsl:text>
				</DocumentType>
				<Currency>
					<xsl:value-of select="/document/summary/currency" />
				</Currency>
				<OriginalDocumentNumber>
					<xsl:value-of select="/document/header/purchaseOrderNo" />
				</OriginalDocumentNumber>
				<OperationType />
				<DocumentInfo>
					<PurchaseOrderNumber>
						<xsl:value-of select="/document/header/purchaseOrderNo" />
					</PurchaseOrderNumber>
					<PurchaseOrderDate>
						<xsl:value-of select="/document/header/invoiceDate" />
					</PurchaseOrderDate>
					<RevisionNumber>
						<xsl:value-of select="/document/header/packingSlipNo" />
					</RevisionNumber>
					<AFENumber />
					<CostCenter />
					<OriginatorCode>
						<xsl:value-of select="document/header/salesOrderNo" />
					</OriginatorCode>
				</DocumentInfo>
				<xsl:for-each select="/document/header/customerPreferenceXrefs/customerPreferenceXref">
					<ReferenceInformation>
						<Name>
							<xsl:value-of select="customerPreference/key" />
						</Name>
						<Number>
							<xsl:value-of select="customerPreference/value" />
						</Number>
					</ReferenceInformation>
				</xsl:for-each>
				<xsl:for-each select="/document/header/infoRefXrefs/headerInfoRefXref">
					<ReferenceInformation>
						<Name>
							<xsl:value-of select="infoRef/key" />
						</Name>
						<Number>
							<xsl:value-of select="infoRef/value" />
						</Number>
					</ReferenceInformation>
				</xsl:for-each>
				<ReferenceInformation>
					<Name>
						<xsl:text>TransmissionDate</xsl:text>
					</Name>
					<Number>
						<xsl:value-of select="/document/transmissionDate" />
					</Number>
				</ReferenceInformation>
				<ReferenceInformation>
					<Name>
						<xsl:text>HeaderStatus</xsl:text>
					</Name>
					<Number>
						<xsl:text>allDetail</xsl:text>
					</Number>
				</ReferenceInformation>
				<ReferenceInformation>
					<Name>
						<xsl:text>TaxAmount</xsl:text>
					</Name>
					<Number>
						<xsl:value-of select="/document/summary/taxAmount" />
					</Number>
				</ReferenceInformation>
				<ReferenceInformation>
					<Name>
						<xsl:text>InvoiceType</xsl:text>
					</Name>
					<Number>
						<xsl:value-of select="/document/header/invoiceType" />
					</Number>
				</ReferenceInformation>
				<PartyInfo>
					<Seller>
						<SellerName>
							<xsl:value-of select="/document/header/seller/name" />
						</SellerName>
						<SellerCode>
							<xsl:value-of select="/document/header/seller/externalLocationIdentifier" />
						</SellerCode>
						<ExternalVendorNo>
							<xsl:value-of select="/document/header/seller/externalVendorNo" />
						</ExternalVendorNo>
						<SellerDUNS>
							<xsl:value-of select="/document/header/seller/externalLocationIdentifier" />
						</SellerDUNS>
						<SellerAddress1>
							<xsl:value-of select="/document/header/seller/addressLine1" />
						</SellerAddress1>
						<SellerAddress2>
							<xsl:value-of select="/document/header/seller/addressLine2" />
						</SellerAddress2>
						<SellerCity>
							<xsl:value-of select="/document/header/seller/city" />
						</SellerCity>
						<SellerProvince>
							<xsl:value-of select="/document/header/seller/stateProvince" />
						</SellerProvince>
						<SellerPostalCode>
							<xsl:value-of select="/document/header/seller/postalCode" />
						</SellerPostalCode>
						<SellerCountry>
							<xsl:value-of select="/document/header/seller/countryCode" />
						</SellerCountry>
						<SellerContactName>
							<xsl:value-of select="/document/header/seller/contacts/contact/name" />
						</SellerContactName>
						<SellerPhoneNumber>
							<xsl:value-of select="/document/header/seller/contacts/contact/phoneNo" />
						</SellerPhoneNumber>
						<SellerEmail>
							<xsl:value-of select="/document/header/seller/contacts/contact/emailAddress" />
						</SellerEmail>
						<AlternateAddressID />
					</Seller>
					<ShipTo>
						<ShipToName>
							<xsl:value-of select="/document/header/shipTo/name" />
						</ShipToName>
						<ShipToCode>
							<xsl:value-of select="/document/header/shipTo/externalLocationIdentifier" />
						</ShipToCode>
						<ShipToDUNS>
							<xsl:text>SUNCOR</xsl:text>
						</ShipToDUNS>
						<ShipToAddress1>
							<xsl:value-of select="/document/header/shipTo/addressLine1" />
						</ShipToAddress1>
						<ShipToAddress2>
							<xsl:value-of select="/document/header/shipTo/addressLine2" />
						</ShipToAddress2>
						<ShipToCity>
							<xsl:value-of select="/document/header/shipTo/city" />
						</ShipToCity>
						<ShipToProvince>
							<xsl:value-of select="/document/header/shipTo/stateProvince" />
						</ShipToProvince>
						<ShipToPostalCode>
							<xsl:value-of select="/document/header/shipTo/postalCode" />
						</ShipToPostalCode>
						<ShipToCountry>
							<xsl:value-of select="/document/header/shipTo/countryCode" />
						</ShipToCountry>
						<ShipToContactName />
						<ShipToContactPhoneNumber>
							<xsl:value-of select="/document/header/shipTo/contacts/contact/phoneNo" />
						</ShipToContactPhoneNumber>
						<ShipToContactEmail />
					</ShipTo>
					<ShipFrom>
						<ShipFromName>
							<xsl:value-of select="/document/header/shipFrom/name" />
						</ShipFromName>
						<ShipFromCode />
						<ShipFromAddress1>
							<xsl:value-of select="/document/header/shipFrom/addressLine1" />
						</ShipFromAddress1>
						<ShipFromAddress2 />
						<ShipFromCity>
							<xsl:value-of select="/document/header/shipFrom/city" />
						</ShipFromCity>
						<ShipFromProvince>
							<xsl:value-of select="/document/header/shipFrom/stateProvince" />
						</ShipFromProvince>
						<ShipFromPostalCode>
							<xsl:value-of select="/document/header/shipFrom/postalCode" />
						</ShipFromPostalCode>
						<ShipFromCountry>
							<xsl:value-of select="/document/header/shipFrom/countryCode" />
						</ShipFromCountry>
					</ShipFrom>
					<RemitTo>
						<RemitToName>
							<xsl:value-of select="/document/header/remitTo/name" />
						</RemitToName>
						<RemitToCode />
						<RemitToAddress1>
							<xsl:value-of select="/document/header/remitTo/addressLine1" />
						</RemitToAddress1>
						<RemitToAddress2 />
						<RemitToCity>
							<xsl:value-of select="/document/header/remitTo/city" />
						</RemitToCity>
						<RemitToProvince>
							<xsl:value-of select="/document/header/remitTo/stateProvince" />
						</RemitToProvince>
						<RemitToPostalCode>
							<xsl:value-of select="/document/header/remitTo/postalCode" />
						</RemitToPostalCode>
						<RemitToCountry>
							<xsl:value-of select="/document/header/remitTo/countryCode" />
						</RemitToCountry>
					</RemitTo>
					<BillTo>
						<BillToName>
							<xsl:value-of select="/document/header/billTo/name" />
						</BillToName>
						<BillToCode>
							<xsl:value-of select="/document/header/billTo/externalLocationIdentifier" />
						</BillToCode>
						<BillToDUNS />
						<BillToAddress1>
							<xsl:value-of select="/document/header/billTo/addressLine1" />
						</BillToAddress1>
						<BillToAddress2 />
						<BillToCity>
							<xsl:value-of select="/document/header/billTo/city" />
						</BillToCity>
						<BillToProvince>
							<xsl:value-of select="/document/header/billTo/stateProvince" />
						</BillToProvince>
						<BillToPostalCode>
							<xsl:value-of select="/document/header/billTo/postalCode" />
						</BillToPostalCode>
						<BillToCountry>
							<xsl:value-of select="/document/header/billTo/countryCode" />
						</BillToCountry>
					</BillTo>
					<SoldTo>
						<SoldToName>
							<xsl:value-of select="/document/header/soldTo/name" />
						</SoldToName>
						<SoldToAddress1>
							<xsl:value-of select="/document/header/soldTo/addressLine1" />
						</SoldToAddress1>
						<SoldToAddress2 />
						<SoldToCity>
							<xsl:value-of select="/document/header/soldTo/city" />
						</SoldToCity>
						<SoldToProvince>
							<xsl:value-of select="/document/header/soldTo/stateProvince" />
						</SoldToProvince>
						<SoldToPostalCode>
							<xsl:value-of select="/document/header/soldTo/postalCode" />
						</SoldToPostalCode>
						<SoldToCountry>
							<xsl:value-of select="/document/header/soldTo/countryCode" />
						</SoldToCountry>
					</SoldTo>
				</PartyInfo>
				<Dates>
					<ServiceStartDate>
						<xsl:value-of select="/document/header/startDate" />
					</ServiceStartDate>
					<ServiceEndDate>
						<xsl:value-of select="/document/header/endDate" />
					</ServiceEndDate>
					<DeliveryDate>
						<xsl:value-of select="/document/details/details/requestedDeliveryDate" />
					</DeliveryDate>
					<PromissedDate>
						<xsl:value-of select="/document/details/details/promisedDate" />
					</PromissedDate>
					<ShippedDate>
						<xsl:value-of select="/document/header/shippedDate" />
					</ShippedDate>
				</Dates>
				<Shipment>
					<ShipmentPayment>
						<xsl:value-of select="/document/header/shipTo/name" />
					</ShipmentPayment>
					<SpecialInstructions>
						<xsl:value-of select="/document/header/shipTo/name" />
					</SpecialInstructions>
				</Shipment>
				<Terms>
					<PaymentTerms>
						<xsl:value-of select="/document/header/paymentTerms" />
					</PaymentTerms>
					<PaymentDescription>
						<xsl:value-of select="/document/header/paymentTermsShort" />
					</PaymentDescription>
				</Terms>
				<Comments />
			</HeaderInformation>
			<xsl:for-each select="/document/details/detail">
				<LineItems>
					<LineNumber>
						<xsl:value-of select="lineNo" />
					</LineNumber>
					<Quantity>
						<xsl:value-of select="quantity" />
					</Quantity>
					<UOM>
						<xsl:value-of select="unitOfMeasure" />
					</UOM>
					<UnitPrice>
						<xsl:value-of select="price" />
					</UnitPrice>
					<ListUnitPrice>
						<xsl:value-of select="price" />
					</ListUnitPrice>
					<LineDescription>
						<xsl:value-of select="description" />
					</LineDescription>
					<LineItemTotal>
						<xsl:value-of select="total" />
					</LineItemTotal>
					<Taxes>
						<Tax>
							<Name>
								<xsl:value-of select="detailTaxXref/detailTaxXref/tax/type" />
							</Name>
							<Exempt>
								<xsl:value-of select="detailTaxXref/detailTaxXref/tax/exempt" />
							</Exempt>
							<Rate>
								<xsl:value-of select="detailTaxXref/detailTaxXref/tax/rate" />
							</Rate>
							<Amount>
								<xsl:value-of select="detailTaxXref/detailTaxXref/tax/taxAmount" />
							</Amount>
						</Tax>
					</Taxes>
					<LineItemInfo>
						<ProductNumber1>
							<xsl:value-of select="/document/details/detail/buyerItemQualifier" />
						</ProductNumber1>
						<ScheduleLineNumber>
							<xsl:apply-templates select="/document/details/detail/infoRefXrefs/detailInfoRefXref/infoRef[contains(key,'Schedule LineNumber')]/value" />
						</ScheduleLineNumber>
						<ProductNumber2 />
						<BuyerItemNumber>
							<xsl:value-of select="/document/details/detail/buyerItemId" />
						</BuyerItemNumber>
						<SupplierItemNumber>
							<xsl:value-of select="/document/details/detail/sellerItemId" />
						</SupplierItemNumber>
						<FieldTicketNumber />
						<FieldTicketLineNo>
							<xsl:value-of select="/document/details/detail/fieldTicketLineNo" />
						</FieldTicketLineNo>
						<PurchaseOrderNumber></PurchaseOrderNumber>
						<PurchaseOrderLineNo>
							<xsl:value-of select="/document/details/detail/purchaseOrderLineNo" />
						</PurchaseOrderLineNo>
					</LineItemInfo>
					<xsl:for-each select="/document/details/detail/infoRefXrefs/detailInfoRefXref">
						<ReferenceInformation>
							<Name>
								<xsl:value-of select="infoRef/key" />
							</Name>
							<Number>
								<xsl:value-of select="infoRef/value" />
							</Number>
							<Description>
								<xsl:value-of select="infoRef/key" />
							</Description>
						</ReferenceInformation>
					</xsl:for-each>
					<PartyInfo>
						<ShipTo />
					</PartyInfo>
					<Dates>
						<ServiceStartDate>
							<xsl:value-of select="/document/header/startDate" />
						</ServiceStartDate>
						<ServiceEndDate>
							<xsl:value-of select="/document/header/endDate" />
						</ServiceEndDate>
						<DeliveryDate>
							<xsl:value-of select="/document/header/requestedDeliveryDate" />
						</DeliveryDate>
						<PromissedDate>
							<xsl:value-of select="/document/header/promisedDate" />
						</PromissedDate>
					</Dates>
				</LineItems>
			</xsl:for-each>
			<Summary>
				<TotalLineItems>
					<xsl:value-of select="/document/summary/totalLineCount" />
				</TotalLineItems>
				<SubTotalAmount>
					<xsl:value-of select="/document/summary/subTotal" />
				</SubTotalAmount>
				<TotalAmount>
					<xsl:value-of select="/document/summary/total" />
				</TotalAmount>
				<Taxes>
					<xsl:for-each select="/document/summary/taxXrefs/documentSummaryTaxXref">
						<Tax>
							<Name>
								<xsl:value-of select="tax/type" />
							</Name>
							<Exempt>
								<xsl:value-of select="tax/exempt" />
							</Exempt>
							<Rate>
								<xsl:value-of select="tax/rate" />
							</Rate>
							<Amount>
								<xsl:value-of select="tax/taxAmount" />
							</Amount>
							<TaxProvince>
								<xsl:value-of select="tax/stateProvince" />
							</TaxProvince>
						</Tax>
					</xsl:for-each>
				</Taxes>
			</Summary>
		</Document>
	</xsl:template>
</xsl:stylesheet>