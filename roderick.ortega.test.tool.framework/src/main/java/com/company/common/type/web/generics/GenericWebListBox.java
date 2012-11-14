package com.company.common.type.web.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebListBoxInterface;

public class GenericWebListBox extends GenericWebElement implements AbstractWebListBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebListBox.class);
	
	@Override
	public int getItemCount() {
		logger.debug("GenericWebListBox|getItemCount");
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		logger.debug("GenericWebListBox|select: " + itemIndex);
		
	}

	@Override
	public void select(String itemText) {
		logger.debug("GenericWebListBox|select: " + itemText);
		
	}

}
