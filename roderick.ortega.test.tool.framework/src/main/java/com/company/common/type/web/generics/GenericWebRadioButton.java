package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;

public class GenericWebRadioButton extends GenericWebElement implements AbstractWebRadioButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public boolean isSelected() {
		System.out.println("GenericWebRadioButton|isSelected");
		return false;
	}

	@Override
	public void select() {
		System.out.println("GenericWebRadioButton|select");
		
	}

}
