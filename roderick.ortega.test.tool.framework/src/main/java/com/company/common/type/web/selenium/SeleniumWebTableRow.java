package com.company.common.type.web.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractSeleniumWebElementInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.Locator;

public class SeleniumWebTableRow extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTableRowInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebTableRow.class);
	
	private int index;
	
	@Override
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public SeleniumWebTableRow(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		logger.debug("SeleniumWebTableRow|getCell: [" + itemIdentifierIndex + "]");
		Locator locator = new Locator(this.getLocator().getXPathLocator() + "//TD");
		Locator newLocator = new Locator(locator.getXPathLocator() + "[" + itemIdentifierIndex + "]");
		
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(locator);
		return new SeleniumWebElement(((AbstractSeleniumWebElementInterface)elements.get(itemIdentifierIndex - 1)).getWebElement(), newLocator, this.getWebBrowser());
	}

	@Override
	public int getCellCount() {
		logger.debug("SeleniumWebTableRow|getCellCount");
		Locator locator = new Locator(this.getLocator().getXPathLocator() + "//TD");
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(locator);
		return elements.size();
	}

}
