package com.company.common.type.web.selenium.composite;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;
import com.company.common.type.web.selenium.SeleniumWebElement;
import com.company.common.types.Locator;

public class SeleniumWebSuggestBox extends SeleniumWebElement implements TestObjectInterface, AbstractWebSuggestBoxInterface {

	public SeleniumWebSuggestBox(WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSelection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearText() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2) {
		// TODO Auto-generated method stub

	}

}
