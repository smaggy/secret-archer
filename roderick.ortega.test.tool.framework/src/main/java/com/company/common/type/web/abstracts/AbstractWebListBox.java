package com.company.common.type.web.abstracts;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebListBoxInterface;

public abstract class AbstractWebListBox extends AbstractWebElement implements AbstractWebListBoxInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String itemText) {
		// TODO Auto-generated method stub

	}

}
