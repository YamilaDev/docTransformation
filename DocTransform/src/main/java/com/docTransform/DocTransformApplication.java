package com.docTransform;

import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.docTransform" })
public class DocTransformApplication {

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(DocTransformApplication.class, args);
	}

}
