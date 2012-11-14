package com.company.common.type.web.abstracts;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;

public abstract class AbstractTestObject implements ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public boolean exists() {
		System.out.println("AbstractTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("AbstractTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("AbstractTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("AbstractTestObject|typeKeys: " + keys + "|" + delay);

	}

	@Override
	public void click() {
		System.out.println("AbstractTestObject|click");

	}

	@Override
	public void doubleClick() {
		System.out.println("AbstractTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		System.out.println("AbstractTestObject|mouseMove");

	}

}
