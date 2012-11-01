package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.types.Locator;

public class SilktestWebListBox extends SilktestWebElement implements AbstractWebListBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	public SilktestWebListBox(DomListBox domListBox, Locator locator, SilktestWebBrowser webBrowser) {
		super(domListBox, locator, webBrowser);
	}
	
	@Override
	public int getItemCount() {
		System.out.println("SilktestWebListBox|getItemCount");
		return ((DomListBox) getDomElement()).getItemCount();
	}

	@Override
	public void select(int itemIndex) {
		System.out.println("SilktestWebListBox|select: [" + itemIndex + "]");
		((DomListBox) getDomElement()).select(itemIndex);
	}

	@Override
	public void select(String itemText) {
		System.out.println("SilktestWebListBox|select: [" + itemText + "]");
		((DomListBox) getDomElement()).select(itemText);
	}

}
