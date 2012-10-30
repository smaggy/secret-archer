package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebLinkInterface;
import com.company.common.types.Locator;

public class SeleniumWebLink extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebLinkInterface {

	public SeleniumWebLink(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void select() {
		System.out.println("SeleniumWebLink|select");
		this.click();
	}

}
