package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;

public class GenericWebTableRow extends GenericWebElement implements AbstractWebTableRowInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebTableRow.class);
	
	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		logger.debug("GenericWebTableRow|getCell: " + itemIdentifierIndex);
		return null;
	}

	@Override
	public int getCellCount() {
		logger.debug("GenericWebTableRow|getCellCount");
		return 0;
	}

	@Override
	public int getIndex() {
		logger.debug("GenericWebTableRow|getIndex");
		return 0;
	}

}
