package com.company.common.type.web.generics;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;

public class GenericWebElement extends GenericTestObject implements AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public List<String> getDomAttributeList() {
		System.out.println("GenericWebElement|getDomAttributeList");
		return null;
	}

	@Override
	public String getText() {
		System.out.println("GenericWebElement|getText");
		return null;
	}

}
