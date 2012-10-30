package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.types.Locator;

public class SeleniumWebCheckBox extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebCheckBoxInterface {

	public SeleniumWebCheckBox(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void check() {
		System.out.println("SeleniumWebButton|check");
		if (getState() == 0) {
			this.click();
		}
	}

	@Override
	public void uncheck() {
		System.out.println("SeleniumWebButton|uncheck");
		if (getState() == 1 ) {
			this.click();
		}
	}

	@Override
	public int getState() {
		System.out.println("SeleniumWebButton|getState");
		boolean selected = getWebElement().isSelected();
		if (selected) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
