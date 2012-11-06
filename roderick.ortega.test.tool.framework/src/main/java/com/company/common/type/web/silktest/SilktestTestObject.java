package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class SilktestTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SilktestTestObject.class);
	
	@Override
	public boolean exists() {
		logger.debug("SilktestTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		logger.debug("SilktestTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		logger.debug("SilktestTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		logger.debug("SilktestTestObject|typeKeys: " + keys + "|" + delay);

	}

	@Override
	public void click() {
		logger.debug("SilktestTestObject|click");

	}

	@Override
	public void doubleClick() {
		logger.debug("SilktestTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		logger.debug("SilktestTestObject|mouseMove");

	}
	
}
