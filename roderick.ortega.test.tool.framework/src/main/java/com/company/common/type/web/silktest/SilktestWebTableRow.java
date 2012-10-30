package com.company.common.type.web.silktest;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;

public class SilktestWebTableRow extends SilktestWebElement implements AbstractWebTableRowInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCellCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

}
