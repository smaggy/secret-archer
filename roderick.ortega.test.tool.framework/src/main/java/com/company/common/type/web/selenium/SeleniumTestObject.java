package com.company.common.type.web.selenium;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class SeleniumTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	@Override
	public boolean exists() {
		System.out.println("SeleniumTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("SeleniumTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("SeleniumTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("SeleniumTestObject|typeKeys: " + keys + "|" + delay);

	}

	@Override
	public void click() {
		System.out.println("SeleniumTestObject|click");

	}

	@Override
	public void doubleClick() {
		System.out.println("SeleniumTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		System.out.println("SeleniumTestObject|mouseMove");

	}
}
