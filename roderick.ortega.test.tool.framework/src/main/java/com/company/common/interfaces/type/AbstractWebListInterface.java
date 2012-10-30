package com.company.common.interfaces.type;

import java.util.List;

import com.company.common.interfaces.action.SearchableListInterface;

public interface AbstractWebListInterface extends AbstractWebElementInterface, SearchableListInterface {
	public AbstractWebElementInterface getListItem(int itemIndex);
	public List<AbstractWebElementInterface> getListItems(boolean printFlag);
	public int size();
	public void reload();
}
