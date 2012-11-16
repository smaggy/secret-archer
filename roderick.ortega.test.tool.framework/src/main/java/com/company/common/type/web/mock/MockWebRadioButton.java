package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebRadioButtonInterface;

public class MockWebRadioButton extends MockWebElement implements AbstractWebRadioButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebRadioButton.class);
	
	@Override
	public boolean isSelected() {
		logger.debug("MockWebRadioButton|isSelected");
		return false;
	}

	@Override
	public void select() {
		logger.debug("MockWebRadioButton|select");
		
	}

}
