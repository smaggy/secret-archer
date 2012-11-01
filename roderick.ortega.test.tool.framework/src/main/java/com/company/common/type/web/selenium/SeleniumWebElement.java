package com.company.common.type.web.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.company.common.browser.SeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractSeleniumWebElementInterface;
import com.company.common.types.CssSelector;
import com.company.common.types.Locator;

public class SeleniumWebElement extends SeleniumTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractSeleniumWebElementInterface {
	
	private WebElement webElement;
	private SeleniumWebBrowser webBrowser;
	private Locator locator;
	private CssSelector cssSelector;
	
	public SeleniumWebElement (WebElement webElement, Locator locator, SeleniumWebBrowser webBrowser) {
		this.webElement = webElement;
		this.locator = locator;
		this.webBrowser = webBrowser;
	}
	
	/**
	 * =================================================================================
	 * 		START - SETTERS AND GETTERS
	 * =================================================================================
	 */
	
	public WebElement getWebElement() {
		System.out.println("SeleniumWebElement|getWebElement");
		return webElement;
	}
	
	public void setWebElement(WebElement webElement) {
		this.webElement = webElement;
	}

	public SeleniumWebBrowser getWebBrowser() {
		System.out.println("SeleniumWebElement|getWebBrowser");
		return webBrowser;
	}

	public void setWebBrowser(SeleniumWebBrowser webBrowser) {
		this.webBrowser = webBrowser;
	}

	public Locator getLocator() {
		System.out.println("SeleniumWebElement|getLocator");
		return locator;
	}

	public void setLocator(Locator locator) {
		this.locator = locator;
	}

	public CssSelector getCssSelector() {
		System.out.println("SeleniumWebElement|getCssSelector");
		return cssSelector;
	}

	public void setCssSelector(CssSelector cssSelector) {
		this.cssSelector = cssSelector;
	}

	/**
	 * =================================================================================
	 * 		END - SETTERS AND GETTERS
	 * =================================================================================
	 */
	
	@Override
	public List<String> getDomAttributeList() {
		// TODO reo check to see if this is valid
		return null;
	}
	
	@Override
	public String getDomAttribute(String attribute) {
		return getWebElement().getAttribute(attribute);
	}

	@Override
	public String getText() {
		System.out.println("SeleniumWebElement|getText");
		return getWebElement().getText();
	}
	
	@Override
	public boolean exists() {
		System.out.println("SeleniumWebElement|exists");
		return getWebElement().isDisplayed();
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("SeleniumWebElement|pressKeys: " + keys);
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("SeleniumWebElement|typeKeys: " + keys);
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("SeleniumWebElement|typeKeys: " + keys + "|" + delay);
		System.out.println("... Bypassing delay.");
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void click() {
		System.out.println("SeleniumWebElement|click");
		getWebElement().click();
	}

	@Override
	public void doubleClick() {
		// TODO reo check to see if this is valid
		System.out.println("SeleniumTestObject|doubleClick");
		getWebElement().click();
		getWebElement().click();
	}

	@Override
	public void mouseMove() {
		System.out.println("SeleniumTestObject|mouseMove");
		// TODO reo check to see if this is valid
		getWebElement().isDisplayed();
	}

}
