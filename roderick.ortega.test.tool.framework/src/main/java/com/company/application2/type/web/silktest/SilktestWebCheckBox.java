package com.company.application2.type.web.silktest;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;

public class SilktestWebCheckBox extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebCheckBoxInterface {

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
