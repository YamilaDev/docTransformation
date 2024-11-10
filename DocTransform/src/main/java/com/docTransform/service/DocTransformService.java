package com.docTransform.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.docTransform.model.Document;
import com.docTransform.utils.XMLUtils;

@Service
public class DocTransformService {

	public String buildXML(@RequestBody Document xmlData) {
		return XMLUtils.buildXML(xmlData);

	}

}
