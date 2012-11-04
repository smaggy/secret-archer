package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.types.Locator;

public class SeleniumWebButton extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebButtonInterface {

	public SeleniumWebButton(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void select() {
		System.out.println("SeleniumWebButton|select");
		this.click();
	}

}
