package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;

public class GenericWebCheckBox extends GenericWebElement implements AbstractWebCheckBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public void check() {
		System.out.println("GenericWebCheckBox|check");
		
	}

	@Override
	public void uncheck() {
		System.out.println("GenericWebCheckBox|uncheck");
		
	}

	@Override
	public int getState() {
		System.out.println("GenericWebCheckBox|getState");
		return 0;
	}

}
