package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.types.Locator;

public class SilktestWebCheckBox extends SilktestWebElement implements AbstractWebCheckBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SilktestWebCheckBox.class);
	
	public SilktestWebCheckBox(DomCheckBox domCheckBox, Locator locator, SilktestWebBrowser webBrowser) {
		super(domCheckBox, locator, webBrowser);
	}
	
	@Override
	public void check() {
		logger.debug("SilktestWebCheckBox|check");
		((DomCheckBox) getDomElement()).check();
	}

	@Override
	public void uncheck() {
		logger.debug("SilktestWebCheckBox|uncheck");
		((DomCheckBox) getDomElement()).uncheck();
	}

	@Override
	public int getState() {
		logger.debug("SilktestWebCheckBox|getState");
		return ((DomCheckBox) getDomElement()).getState();
	}

}
