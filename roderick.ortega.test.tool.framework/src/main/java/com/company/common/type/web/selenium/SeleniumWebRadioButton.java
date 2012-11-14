package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebRadioButtonInterface;
import com.company.common.types.Locator;

public class SeleniumWebRadioButton extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebRadioButtonInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebRadioButton.class);
	
	public SeleniumWebRadioButton(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public boolean isSelected() {
		logger.debug("SeleniumWebRadioButton|isSelected");
		return getWebElement().isSelected();
	}

	@Override
	public void select() {
		logger.debug("SeleniumWebRadioButton|select");
		this.click();
	}

}
