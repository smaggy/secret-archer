package com.company.common.type.web.selenium;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.types.Locator;

public class SeleniumWebListBox extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListBoxInterface {

	public SeleniumWebListBox(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select(int itemIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String itemText) {
		// TODO Auto-generated method stub

	}

}
