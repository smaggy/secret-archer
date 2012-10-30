package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;

public class GenericWebTableRow extends GenericWebElement implements AbstractWebTableRowInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		System.out.println("GenericWebTableRow|getCell: " + itemIdentifierIndex);
		return null;
	}

	@Override
	public int getCellCount() {
		System.out.println("GenericWebTableRow|getCellCount");
		return 0;
	}

	@Override
	public int getIndex() {
		System.out.println("GenericWebTableRow|getIndex");
		return 0;
	}

}
