package com.company.application2.type.web.silktest;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.SearchParameters;

public class SilktestWebList extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListInterface {

	@Override
	public AbstractWebElementInterface getListItem(int itemIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reload() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getListText() {
		// TODO Auto-generated method stub
		return null;
	}

}
