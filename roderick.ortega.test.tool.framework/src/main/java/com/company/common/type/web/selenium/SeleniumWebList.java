package com.company.common.type.web.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;

public class SeleniumWebList extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebListInterface {
	
	public SeleniumWebList(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}
	
	@Override
	public AbstractWebElementInterface getListItem(int itemIndex) {
		System.out.println("SeleniumWebList|getListItem: " + itemIndex);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//LI");
		// get all the elements
		List<AbstractWebElementInterface> seleniumWebElements = getWebBrowser().findAllWebElements(locator);
		// pick out the [itenIndex] element and return the requested webElement
		return seleniumWebElements.get(itemIndex);
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		System.out.println("SeleniumWebList|getListItems: " + printFlag);
		// build the xQuery
		Locator locator = new Locator(getLocator().getXPathLocator() + "//LI");
		// get and return all the elements
		if (printFlag) {
			List<AbstractWebElementInterface> webElements = getWebBrowser().findAllWebElements(locator);
			for (AbstractWebElementInterface seleniumWebElement : webElements) {
				System.out.println(seleniumWebElement.getText());
			}
			return webElements;
		}
		else {
			return getWebBrowser().findAllWebElements(locator);
		}
	}

	@Override
	public int size() {
		System.out.println("SeleniumWebList|size");
		return getListItems(true).size();
	}

	@Override
	public void reload() {
		System.out.println("SeleniumWebList|reload");
		System.out.println("... not sure what this does.");
		// TODO Auto-generated method stub

	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
