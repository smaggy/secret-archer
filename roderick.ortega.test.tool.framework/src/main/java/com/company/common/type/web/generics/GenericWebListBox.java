package com.company.common.type.web.generics;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;

public class GenericWebListBox extends GenericWebElement implements AbstractWebListBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public int getItemCount() {
		System.out.println("GenericWebListBox|getItemCount");
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		System.out.println("GenericWebListBox|select: " + itemIndex);
		
	}

	@Override
	public void select(String itemText) {
		System.out.println("GenericWebListBox|select: " + itemText);
		
	}

}
