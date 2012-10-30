package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;

public class GenericWebTextField extends GenericWebElement implements AbstractWebTextFieldInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public void setText(String text) {
		System.out.println("GenericWebTextField|setText: " + text);
		
	}

}
