package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebButtonInterface;
import com.company.common.types.Locator;

public class SilktestWebButton extends SilktestWebElement implements AbstractWebButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SilktestWebButton.class);
	
	public SilktestWebButton(DomButton domButton, Locator locator, SilktestWebBrowser webBrowser) {
		super(domButton, locator, webBrowser);
	}
	
	@Override
	public void select() {
		logger.debug("SilktestWebElement|select");
		((DomButton) getDomElement()).select();
	}

}
