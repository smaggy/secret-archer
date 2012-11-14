package com.company.application2.type.web.silktest;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;

public class SilktestWebTableRow extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTableRowInterface {

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
