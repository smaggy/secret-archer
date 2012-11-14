package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebTextFieldInterface;
import com.company.common.types.Locator;

public class SeleniumWebTextField extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTextFieldInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebTextField.class);
	
	public SeleniumWebTextField(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void setText(String text) {
		logger.debug("SeleniumWebTextField|setText: " + text);
		this.getWebElement().clear();
		this.typeKeys(text);
	}

}
