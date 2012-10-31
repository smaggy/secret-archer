package com.company.application2.type.web.silktest;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;

public class SilktestWebElement extends SilktestTestObject implements ClickableInterface, KeyableInterface, TestObjectInterface, AbstractWebElementInterface {

	@Override
	public List<String> getDomAttributeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDomAttribute(String attribute) {
		// TODO Auto-generated method stub
		return null;
	}

}
