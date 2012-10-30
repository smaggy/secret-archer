package com.company.common.type.web.abstracts;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;

public abstract class AbstractWebRadioButton extends AbstractWebElement implements AbstractWebRadioButtonInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

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
