package com.company.common.type.web.generics;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.SearchParameters;

public class GenericWebList extends GenericWebElement implements AbstractWebListInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public GenericWebElement getListItem(int itemIndex) {
		System.out.println("GenericWebList|getListItem: " + itemIndex);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		System.out.println("GenericWebList|getListItems: " + printFlag);
		return null;
	}

	@Override
	public int size() {
		System.out.println("GenericWebList|size");
		return 0;
	}

	@Override
	public void reload() {
		System.out.println("GenericWebList|reload");
		
	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		System.out.println("GenericWebList|searchList: " + list + "|" + searchParameters);
		return null;
	}

}
