package com.company.common.type.web.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.types.Locator;

public class SeleniumWebListBox extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListBoxInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebListBox.class);
	
	public SeleniumWebListBox(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public int getItemCount() {
		logger.debug("SeleniumWebListBox|getItemCount");
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//OPTION");
		// get and return all the elements
		List<AbstractWebElementInterface> webElements = getWebBrowser().findAllWebElements(locator);
		return webElements.size();
	}

	@Override
	public void select(int itemIndex) {
		logger.debug("SeleniumWebListBox|select: " + itemIndex);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//OPTION");
		// get and return all the elements
		List<AbstractWebElementInterface> webElements = getWebBrowser().findAllWebElements(locator);
		webElements.get(itemIndex).click();
	}

	@Override
	public void select(String itemText) {
		logger.debug("SeleniumWebListBox|select: " + itemText);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//OPTION");
		// get and return all the elements
		List<AbstractWebElementInterface> webElements = getWebBrowser().findAllWebElements(locator);
		for (AbstractWebElementInterface webElement : webElements) {
			if (webElement.getText().equalsIgnoreCase(itemText)) {
				webElement.click();
				break;
			}
		}
	}

}
