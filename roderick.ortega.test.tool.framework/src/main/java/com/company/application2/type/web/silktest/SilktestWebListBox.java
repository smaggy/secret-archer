package com.company.application2.type.web.silktest;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;

public class SilktestWebListBox extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListBoxInterface {

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String itemText) {
		// TODO Auto-generated method stub

	}

}
