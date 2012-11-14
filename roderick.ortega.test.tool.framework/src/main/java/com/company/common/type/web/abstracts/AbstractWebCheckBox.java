package com.company.common.type.web.abstracts;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;

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
