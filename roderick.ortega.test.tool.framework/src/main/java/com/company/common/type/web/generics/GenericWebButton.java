package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;

public class GenericWebButton extends GenericWebElement implements AbstractWebButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public void select() {
		System.out.println("GenericWebButton|select");
		
	}

}
