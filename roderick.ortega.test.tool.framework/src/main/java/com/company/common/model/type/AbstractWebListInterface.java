package com.company.common.model.type;

import java.util.List;

import com.company.common.model.action.SearchableListInterface;

public interface AbstractWebListInterface extends AbstractWebElementInterface, SearchableListInterface {
	public AbstractWebElementInterface getListItem(int itemIndex);
	public List<AbstractWebElementInterface> getListItems(boolean printFlag);
	public int size();
	public void reload();
	public List<String> getListText();
}
