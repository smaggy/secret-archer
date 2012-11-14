package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebLinkInterface;
import com.company.common.types.Locator;

public class SeleniumWebLink extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebLinkInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebLink.class);
	
	public SeleniumWebLink(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void select() {
		logger.debug("SeleniumWebLink|select");
		this.click();
	}

}
