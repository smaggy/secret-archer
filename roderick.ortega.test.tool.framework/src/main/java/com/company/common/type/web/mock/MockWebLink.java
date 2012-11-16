package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebLinkInterface;

public class MockWebLink extends MockWebElement implements AbstractWebLinkInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebLink.class);
	
	@Override
	public void select() {
		logger.debug("MockWebLink|select");
		
	}

}
