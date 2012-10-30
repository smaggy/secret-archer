package com.company.common.type.web.abstracts;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;

public abstract class AbstractWebCheckBox extends AbstractWebElement implements AbstractWebCheckBoxInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void uncheck() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return 0;
	}

}
