package com.company.common.type.web.generics;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;

public class GenericWebElement extends GenericTestObject implements AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebElement.class);
	
	@Override
	public List<String> getDomAttributeList() {
		logger.debug("GenericWebElement|getDomAttributeList");
		return null;
	}

	@Override
	public String getText() {
		logger.debug("GenericWebElement|getText");
		return null;
	}

	@Override
	public String getDomAttribute(String attribute) {
		logger.debug("GenericWebElement|getDomAttribute: " + attribute);
		return null;
	}

}
