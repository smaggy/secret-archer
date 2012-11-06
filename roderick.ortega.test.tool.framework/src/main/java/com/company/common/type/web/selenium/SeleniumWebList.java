package com.company.common.type.web.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;
import com.company.common.utils.Searchable;

public class SeleniumWebList extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SeleniumWebList.class);
	
	public SeleniumWebList(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}
	
	@Override
	public AbstractWebElementInterface getListItem(int itemIndex) {
		logger.debug("SeleniumWebList|getListItem: " + itemIndex);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//LI");
		// get all the elements
		List<AbstractWebElementInterface> seleniumWebElements = getWebBrowser().findAllWebElements(locator);
		// pick out the [itenIndex] element and return the requested webElement
		return seleniumWebElements.get(itemIndex);
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		logger.debug("SeleniumWebList|getListItems: " + printFlag);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//LI");
		// get and return all the elements
		if (printFlag) {
			List<AbstractWebElementInterface> webElements = getWebBrowser().findAllWebElements(locator);
			for (AbstractWebElementInterface seleniumWebElement : webElements) {
				logger.debug(seleniumWebElement.getText());
			}
			return webElements;
		}
		else {
			return getWebBrowser().findAllWebElements(locator);
		}
	}

	@Override
	public int size() {
		logger.debug("SeleniumWebList|size");
		return getListItems(true).size();
	}

	@Override
	public void reload() {
		logger.debug("SeleniumWebList|reload");
		logger.debug("... not sure what this does.");
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		logger.debug("SeleniumWebList|searchList: [" + list + "|" + searchParameters + "]");
		return Searchable.searchList(list, searchParameters);
	}

	@Override
	public List<String> getListText() {
		logger.debug("SeleniumWebList|getListText");
		List<String> retList = new ArrayList<String>();
		Locator locator = new Locator(getLocator().getXPathLocator() + "//LI");
		List<AbstractWebElementInterface> seleniumWebElements = getWebBrowser().findAllWebElements(locator);
		for (AbstractWebElementInterface element : seleniumWebElements) {
			retList.add(element.getText());
		}
		return retList;
	}

}
