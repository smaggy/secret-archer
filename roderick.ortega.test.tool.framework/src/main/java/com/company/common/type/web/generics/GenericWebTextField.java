package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebTextFieldInterface;

public class GenericWebTextField extends GenericWebElement implements AbstractWebTextFieldInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebTextField.class);
	
	@Override
	public void setText(String text) {
		logger.debug("GenericWebTextField|setText: " + text);
		
	}

}
