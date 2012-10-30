package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.types.Locator;

public class SeleniumWebTextField extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTextFieldInterface {

	public SeleniumWebTextField(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void setText(String text) {
		System.out.println("SeleniumWebTextField|setText: " + text);
		this.typeKeys(text);
	}

}
