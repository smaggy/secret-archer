package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomLink;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebLinkInterface;
import com.company.common.types.Locator;

public class SilktestWebLink extends SilktestWebElement implements AbstractWebLinkInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(SilktestWebLink.class);
	
	public SilktestWebLink(DomLink domLink, Locator locator, SilktestWebBrowser webBrowser) {
		super(domLink, locator, webBrowser);
	}
	
	@Override
	public void select() {
		logger.debug("SilktestWebLink|select");
		((DomLink) getDomElement()).select();
	}

}
