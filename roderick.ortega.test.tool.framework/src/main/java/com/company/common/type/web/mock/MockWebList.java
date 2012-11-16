package com.company.common.type.web.mock;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebListInterface;
import com.company.common.types.SearchParameters;

public class MockWebList extends MockWebElement implements AbstractWebListInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebList.class);
	
	@Override
	public MockWebElement getListItem(int itemIndex) {
		logger.debug("MockWebList|getListItem: " + itemIndex);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		logger.debug("MockWebList|getListItems: " + printFlag);
		return null;
	}

	@Override
	public int size() {
		logger.debug("MockWebList|size");
		return 0;
	}

	@Override
	public void reload() {
		logger.debug("MockWebList|reload");
		
	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		logger.debug("MockWebList|searchList: " + list + "|" + searchParameters);
		return null;
	}

	@Override
	public List<String> getListText() {
		logger.debug("MockWebList|getListText");
		return null;
	}

}
