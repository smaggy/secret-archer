package com.company.common.type.web.abstracts;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;

public abstract class AbstractWebElement extends AbstractTestObject implements AbstractWebElementInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

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

}
