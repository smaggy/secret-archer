package com.company.common.type.web.selenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class SeleniumTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SeleniumTestObject.class);
	
	@Override
	public boolean exists() {
		logger.debug("SeleniumTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		logger.debug("SeleniumTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		logger.debug("SeleniumTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		logger.debug("SeleniumTestObject|typeKeys: " + keys + "|" + delay);

	}

	@Override
	public void click() {
		logger.debug("SeleniumTestObject|click");

	}

	@Override
	public void doubleClick() {
		logger.debug("SeleniumTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		logger.debug("SeleniumTestObject|mouseMove");

	}
}
