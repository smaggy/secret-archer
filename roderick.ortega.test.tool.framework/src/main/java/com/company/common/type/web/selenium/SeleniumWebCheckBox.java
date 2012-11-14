package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;
import com.company.common.types.Locator;

public class SeleniumWebCheckBox extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebCheckBoxInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebCheckBox.class);
	
	public SeleniumWebCheckBox(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void check() {
		logger.debug("SeleniumWebButton|check");
		if (getState() == 0) {
			this.click();
		}
	}

	@Override
	public void uncheck() {
		logger.debug("SeleniumWebButton|uncheck");
		if (getState() == 1 ) {
			this.click();
		}
	}

	@Override
	public int getState() {
		logger.debug("SeleniumWebButton|getState");
		boolean selected = getWebElement().isSelected();
		if (selected) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
