package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.types.Locator;

public class SilktestWebCheckBox extends SilktestWebElement implements AbstractWebCheckBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	public SilktestWebCheckBox(DomCheckBox domCheckBox, Locator locator, SilktestWebBrowser webBrowser) {
		super(domCheckBox, locator, webBrowser);
	}
	
	@Override
	public void check() {
		System.out.println("SilktestWebCheckBox|check");
		((DomCheckBox) getDomElement()).check();
	}

	@Override
	public void uncheck() {
		System.out.println("SilktestWebCheckBox|uncheck");
		((DomCheckBox) getDomElement()).uncheck();
	}

	@Override
	public int getState() {
		System.out.println("SilktestWebCheckBox|getState");
		return ((DomCheckBox) getDomElement()).getState();
	}

}
