package com.company.common.type.web.abstracts;

import java.util.List;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;

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
