package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.type.web.abstracts.AbstractTestObject;

public class GenericTestObject extends AbstractTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface {
	
	@Override
	public boolean exists() {
		System.out.println("GenericTestObject|exists");
		return false;
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("GenericTestObject|pressKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("GenericTestObject|typeKeys: " + keys);

	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("GenericTestObject|typeKeys: " + keys + " delay: " + delay);

	}

	@Override
	public void click() {
		System.out.println("GenericTestObject|click");

	}

	@Override
	public void doubleClick() {
		System.out.println("GenericTestObject|doubleClick");

	}

	@Override
	public void mouseMove() {
		System.out.println("GenericTestObject|mouseMove");

	}
}
