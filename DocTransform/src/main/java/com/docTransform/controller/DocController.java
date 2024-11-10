package com.docTransform.controller;

import java.io.IOException;

import javax.xml.bind.PropertyException;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.XmlMappingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import com.docTransform.model.Document;
import com.docTransform.service.DocTransformService;

@RestController
@RequestMapping("/doc")
public class DocController {
	@Autowired
	DocTransformService docTransformService;

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(path = "/transform", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<?> transform(@RequestBody Document document)
			throws XmlMappingException, IOException, PropertyException, javax.xml.bind.JAXBException, ParserConfigurationException, SAXException {
		return new ResponseEntity<>(docTransformService.buildXML(document), HttpStatus.ACCEPTED);
	}
}
