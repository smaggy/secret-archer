package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.types.Locator;

public class SilktestWebButton extends SilktestWebElement implements AbstractWebButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	public SilktestWebButton(DomButton domButton, Locator locator, SilktestWebBrowser webBrowser) {
		super(domButton, locator, webBrowser);
	}
	
	@Override
	public void select() {
		System.out.println("SilktestWebElement|select");
		((DomButton) getDomElement()).select();
	}

}
