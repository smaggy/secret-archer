package com.company.common.type.web.abstracts;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;

public abstract class AbstractWebTextField extends AbstractWebElement implements AbstractWebTextFieldInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

}
