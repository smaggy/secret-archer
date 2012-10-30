package com.company.common.type.web.abstracts;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;

public abstract class AbstractWebButton extends AbstractWebElement implements AbstractWebButtonInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
