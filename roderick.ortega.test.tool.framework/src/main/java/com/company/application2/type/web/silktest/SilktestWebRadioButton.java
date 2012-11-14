package com.company.application2.type.web.silktest;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebRadioButtonInterface;

public class SilktestWebRadioButton extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebRadioButtonInterface {

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
