package com.company.common.type.web.mock;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;

public class MockWebElement extends MockTestObject implements AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebElement.class);
	
	@Override
	public List<String> getDomAttributeList() {
		logger.debug("MockWebElement|getDomAttributeList");
		return null;
	}

	@Override
	public String getText() {
		logger.debug("MockWebElement|getText");
		return null;
	}

	@Override
	public String getDomAttribute(String attribute) {
		logger.debug("MockWebElement|getDomAttribute: " + attribute);
		return null;
	}

}
