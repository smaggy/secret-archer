package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;

public class MockWebTableRow extends MockWebElement implements AbstractWebTableRowInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebTableRow.class);
	
	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		logger.debug("MockWebTableRow|getCell: " + itemIdentifierIndex);
		return null;
	}

	@Override
	public int getCellCount() {
		logger.debug("MockWebTableRow|getCellCount");
		return 0;
	}

	@Override
	public int getIndex() {
		logger.debug("MockWebTableRow|getIndex");
		return 0;
	}

}
