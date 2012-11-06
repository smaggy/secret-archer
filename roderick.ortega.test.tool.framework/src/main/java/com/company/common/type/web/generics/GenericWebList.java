package com.company.common.type.web.generics;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.SearchParameters;

public class GenericWebList extends GenericWebElement implements AbstractWebListInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebList.class);
	
	@Override
	public GenericWebElement getListItem(int itemIndex) {
		logger.debug("GenericWebList|getListItem: " + itemIndex);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		logger.debug("GenericWebList|getListItems: " + printFlag);
		return null;
	}

	@Override
	public int size() {
		logger.debug("GenericWebList|size");
		return 0;
	}

	@Override
	public void reload() {
		logger.debug("GenericWebList|reload");
		
	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		logger.debug("GenericWebList|searchList: " + list + "|" + searchParameters);
		return null;
	}

	@Override
	public List<String> getListText() {
		logger.debug("GenericWebList|getListText");
		return null;
	}

}
