package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.types.Locator;

public class SeleniumWebButton extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebButtonInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebButton.class);
	
	public SeleniumWebButton(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void select() {
		logger.debug("SeleniumWebButton|select");
		this.click();
	}

}
