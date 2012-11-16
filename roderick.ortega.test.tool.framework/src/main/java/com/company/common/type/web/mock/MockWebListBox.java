package com.company.common.type.web.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebListBoxInterface;

public class MockWebListBox extends MockWebElement implements AbstractWebListBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebListBox.class);
	
	@Override
	public int getItemCount() {
		logger.debug("MockWebListBox|getItemCount");
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		logger.debug("MockWebListBox|select: " + itemIndex);
		
	}

	@Override
	public void select(String itemText) {
		logger.debug("MockWebListBox|select: " + itemText);
		
	}

}
