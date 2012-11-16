package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebButtonInterface;

public class MockWebButton extends MockWebElement implements AbstractWebButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebButton.class);
	
	@Override
	public void select() {
		logger.debug("MockWebButton|select");
		
	}

}
