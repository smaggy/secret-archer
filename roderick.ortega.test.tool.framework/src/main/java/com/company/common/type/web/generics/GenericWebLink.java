package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebLinkInterface;

public class GenericWebLink extends GenericWebElement implements AbstractWebLinkInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebLink.class);
	
	@Override
	public void select() {
		logger.debug("GenericWebLink|select");
		
	}

}
