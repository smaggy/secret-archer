package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.types.Locator;

public class SilktestWebTextField extends SilktestWebElement implements AbstractWebTextFieldInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(SilktestWebTextField.class);
	
	public SilktestWebTextField(DomTextField domTextField, Locator locator, SilktestWebBrowser webBrowser) {
		super(domTextField, locator, webBrowser);
	}
	
	@Override
	public void setText(String text) {
		logger.debug("SilktestWebTextField|setText: [" + text + "]");
		((DomTextField) getDomElement()).setText(text);
	}

}
