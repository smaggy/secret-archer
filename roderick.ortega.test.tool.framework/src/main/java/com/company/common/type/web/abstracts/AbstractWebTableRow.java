package com.company.common.type.web.abstracts;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;

public abstract class AbstractWebTableRow extends AbstractWebElement implements AbstractWebTableRowInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

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
