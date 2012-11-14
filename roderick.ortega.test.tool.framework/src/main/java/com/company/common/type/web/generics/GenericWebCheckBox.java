package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;

public class GenericWebCheckBox extends GenericWebElement implements AbstractWebCheckBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebCheckBox.class);
	
	@Override
	public void check() {
		logger.debug("GenericWebCheckBox|check");
		
	}

	@Override
	public void uncheck() {
		logger.debug("GenericWebCheckBox|uncheck");
		
	}

	@Override
	public int getState() {
		logger.debug("GenericWebCheckBox|getState");
		return 0;
	}

}
