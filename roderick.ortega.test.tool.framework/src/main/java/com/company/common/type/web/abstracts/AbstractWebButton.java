package com.company.common.type.web.abstracts;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebButtonInterface;

public abstract class AbstractWebButton extends AbstractWebElement implements AbstractWebButtonInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
