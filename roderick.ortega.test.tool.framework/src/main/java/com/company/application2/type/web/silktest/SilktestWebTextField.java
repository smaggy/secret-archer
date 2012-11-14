package com.company.application2.type.web.silktest;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebTextFieldInterface;

public class SilktestWebTextField extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTextFieldInterface {

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

}
