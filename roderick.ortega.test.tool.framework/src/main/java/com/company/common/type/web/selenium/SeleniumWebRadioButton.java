package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;
import com.company.common.types.Locator;

public class SeleniumWebRadioButton extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebRadioButtonInterface {

	public SeleniumWebRadioButton(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public boolean isSelected() {
		System.out.println("SeleniumWebRadioButton|isSelected");
		return getWebElement().isSelected();
	}

	@Override
	public void select() {
		System.out.println("SeleniumWebRadioButton|select");
		this.click();
	}

}
