package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class GenericTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(GenericTestObject.class);
	
	@Override
	public boolean exists() {
		logger.debug("GenericTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		logger.debug("GenericTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		logger.debug("GenericTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		logger.debug("GenericTestObject|typeKeys: " + keys + " delay: " + delay);

	}

	@Override
	public void click() {
		logger.debug("GenericTestObject|click");

	}

	@Override
	public void doubleClick() {
		logger.debug("GenericTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		logger.debug("GenericTestObject|mouseMove");

	}
}
