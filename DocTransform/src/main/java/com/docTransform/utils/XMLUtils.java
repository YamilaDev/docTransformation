package com.docTransform.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.docTransform.model.Document;

public class XMLUtils {

	static String INPUT_XML_FILE = "src/main/resources/input.xml";
	static String OUTPUT_XML_FILE = "src/main/resources/output.xml";
	static String XSLT_FILE = "src/main/resources/xslt/Transformation.xslt";

	public static String buildXML(Document xmlData) {
		XMLUtils.marshal(xmlData);
		return XMLUtils.transformXSLT();
	}

	public static void marshal(Document xmlData) {

		try {
			JAXBContext contexto = JAXBContext.newInstance(xmlData.getClass());
			Marshaller marshaller = contexto.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			File file = new File(INPUT_XML_FILE);
			marshaller.marshal(xmlData, file);

		} catch (JAXBException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	public static String transformXSLT() throws TransformerFactoryConfigurationError {

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
		Source xsltSource = new StreamSource(XSLT_FILE);
		Templates templates = null;
		Transformer transformer = null;
		Result result = null;
		StringBuilder str = new StringBuilder();

		try {
			templates = transformerFactory.newTemplates(xsltSource);
			Source inputXMLFileSource = new StreamSource(INPUT_XML_FILE);
			transformer = templates.newTransformer();
			result = new StreamResult(OUTPUT_XML_FILE);
			transformer.transform(inputXMLFileSource, result);

			try (BufferedReader br = new BufferedReader(new FileReader(OUTPUT_XML_FILE))) {
				String line;
				while ((line = br.readLine()) != null) {
					str.append(line);
				}
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e.getMessage());
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage());
			}
		} catch (TransformerException e) {
			throw new RuntimeException(e.getMessage());
		}
		return str.toString();
	}

}