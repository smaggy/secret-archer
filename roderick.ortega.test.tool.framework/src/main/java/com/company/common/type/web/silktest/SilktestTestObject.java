package com.company.common.type.web.silktest;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class SilktestTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	@Override
	public boolean exists() {
		System.out.println("SilktestTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("SilktestTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("SilktestTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("SilktestTestObject|typeKeys: " + keys + "|" + delay);

	}

	@Override
	public void click() {
		System.out.println("SilktestTestObject|click");

	}

	@Override
	public void doubleClick() {
		System.out.println("SilktestTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		System.out.println("SilktestTestObject|mouseMove");

	}
	
}
