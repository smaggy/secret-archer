package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomLink;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebLinkInterface;
import com.company.common.types.Locator;

public class SilktestWebLink extends SilktestWebElement implements AbstractWebLinkInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	public SilktestWebLink(DomLink domLink, Locator locator, SilktestWebBrowser webBrowser) {
		super(domLink, locator, webBrowser);
	}
	
	@Override
	public void select() {
		System.out.println("SilktestWebLink|select");
		((DomLink) getDomElement()).select();
	}

}
