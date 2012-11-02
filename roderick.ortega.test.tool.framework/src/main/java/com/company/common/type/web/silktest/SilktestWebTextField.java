package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.types.Locator;

public class SilktestWebTextField extends SilktestWebElement implements AbstractWebTextFieldInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	public SilktestWebTextField(DomTextField domTextField, Locator locator, SilktestWebBrowser webBrowser) {
		super(domTextField, locator, webBrowser);
	}
	
	@Override
	public void setText(String text) {
		System.out.println("SilktestWebTextField|setText: [" + text + "]");
		((DomTextField) getDomElement()).setText(text);
	}

}
