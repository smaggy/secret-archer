package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;

public class MockWebCheckBox extends MockWebElement implements AbstractWebCheckBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebCheckBox.class);
	
	@Override
	public void check() {
		logger.debug("MockWebCheckBox|check");
		
	}

	@Override
	public void uncheck() {
		logger.debug("MockWebCheckBox|uncheck");
		
	}

	@Override
	public int getState() {
		logger.debug("MockWebCheckBox|getState");
		return 0;
	}

}
